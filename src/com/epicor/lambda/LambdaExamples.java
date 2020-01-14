package com.epicor.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExamples {
	public static void main(String[] args) {
		List<Car> cars = getCars();
		
		System.out.println("Raw List");
		System.out.println(cars);
		
		List<Car> compactCars = new ArrayList<Car>();
		for(Car car : cars) {
			if(car.carType == CarType.COMPACT) {
				compactCars.add(car);
			}
		}
		System.out.println("Compact Cars");
		System.out.println(compactCars);
		
		System.out.println("* * * Strategy * * * * ");
		System.out.println(filterCars(cars, new TwentyKCars()));
		
		System.out.println("* * * Anonymous classes * * * * ");
		System.out.println(filterCars(cars, new Searchable() {
			@Override
			public boolean test(Car c) {
				return c.carType == CarType.SEDAN;
			}
		}));
		
		System.out.println("* * * Lambda Expresion * * * * ");
//		char c1 = 'A';
		System.out.println(filterCars(cars, (Car c) -> c.carType == CarType.SEDAN));
		System.out.println(filterCars(cars, c1 -> c1.carType == CarType.SEDAN));
		Searchable fordCars = c -> c.brand.equals("Ford");
		System.out.println(filterCars(cars, fordCars));
		
		

		
		
		
	}
	
	public static List<Car> filterCars(List<Car>cars, Searchable s){
		List<Car> filteredCars = new ArrayList<Car>();
		for(Car car : cars)
		if(s.test(car)) {
			filteredCars.add(car);
		}
		return filteredCars;
	}
	
	
	private static List<Car> getCars(){
		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car("Ford", 4, CarType.COMPACT, 15000));
		cars.add(new Car("Chevrolet", 4, CarType.COMPACT, 17000));
		cars.add(new Car("Kia", 4, CarType.COMPACT, 16000));
		cars.add(new Car("VW", 4, CarType.SUV, 15000));
		cars.add(new Car("BMW", 4, CarType.SUV, 30000));
		cars.add(new Car("Ford", 4, CarType.SEDAN, 25000));
		cars.add(new Car("Kia", 4, CarType.SEDAN, 16000));
		cars.add(new Car("VW", 4, CarType.SEDAN, 23000));
		cars.add(new Car("Mercedez", 4, CarType.LUXURY, 60000));
		return cars;
		
	}
	
}

interface Searchable{
	boolean test(Car c);
}

class TwentyKCars implements Searchable{

	@Override
	public boolean test(Car c) {
		return c.cost < 20000;
	}
	
}








class Car{
	String brand;
	int cylinders;
	CarType carType;
	double cost;
	public Car(String brand, int cylinders, CarType carType, double cost) {
		super();
		this.brand = brand;
		this.cylinders = cylinders;
		this.carType = carType;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", cylinders=" + cylinders + ", carType=" + carType + ", cost=" + cost + "]";
	}
	
}

enum CarType{
	COMPACT, SUV, LUXURY,SEDAN
}
