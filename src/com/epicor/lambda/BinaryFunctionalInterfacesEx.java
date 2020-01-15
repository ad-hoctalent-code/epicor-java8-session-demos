package com.epicor.lambda;

import java.util.Locale;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class BinaryFunctionalInterfacesEx {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer>  divisible = (x, y) -> x % y == 0;
		System.out.println("****** BiPredicate ");
		System.out.println(divisible.test(10,  5));
		System.out.println(divisible.test(11,  5));
		
		
		System.out.println("****** BiConsumer ");
		BiConsumer<String, String> c1 = (s1, s2) -> System.out.println(s1 + " " + s2);
		c1.accept("Hello" , "World");
		
		System.out.println("****** BiFuncton ");
		BiFunction<String, String, String> f1 = (s1, s2) -> s1.concat(s2);
		System.out.println(f1.apply("Hello ", "World"));
		
		BiFunction<String, String, Locale> f2 = (s1, s2) -> new Locale(s1, s2);
		System.out.println("USA: "+ f2.apply("en", "US"));
		System.out.println("Mexico: "+ f2.apply("es", "MX"));
		System.out.println("Brazil: "+ f2.apply("pt", "BR"));
		
		BiFunction<CarType, String, Car> f3 = (carType, brand) -> new Car(brand, 4, carType, 20000);
		System.out.println(f3.apply(CarType.COMPACT, "VW"));
		System.out.println(f3.apply(CarType.COMPACT, "Ford"));
		System.out.println(f3.apply(CarType.SUV, "Mazda"));
		System.out.println(f3.apply(CarType.LUXURY, "BMW"));
		
		
		BinaryOperator<String> b1 = (s1, s2) -> s1.concat(s2);
		System.out.println(b1.apply("Hello ", "World"));
		
		BinaryOperator<Integer> b2 = BinaryOperator.minBy((x,y) -> x.compareTo(y));
		System.out.println(b2.apply(10, 5));
		System.out.println(b2.apply(1, 15));
		
		
		
			
		
			
		
		
	}
}
