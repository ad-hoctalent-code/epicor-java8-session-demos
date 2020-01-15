package com.epicor.lambda;

import java.util.function.DoubleToLongFunction;
import java.util.function.Function;
import java.util.function.ToLongFunction;

public class FunctionExample {
	public static void main(String[] args) {
		Function<CarType, Car> buildCar = carType -> new Car("VW", 4, carType,20000);
		
		System.out.println(buildCar.apply(CarType.LUXURY));
		
		Function<Double, Long> round1 = d -> Math.round(d);
		
		ToLongFunction<Double> round2 = d -> Math.round(d);
		
		DoubleToLongFunction round3 = d -> Math.round(d);
		
		System.out.println("Classes: " + round1.apply(1345.56));
		System.out.println("Class -> primitive: " + round2.applyAsLong(1345.56));
		System.out.println("Primitives: " + round3.applyAsLong(1345.56));
		
		Function<Integer, Integer> x2 = x -> x * 2; 
		Function<Integer, Integer> xx = x -> x * x; 
		
		System.out.println(x2.compose(xx).apply(4)); // 4 * 4 = 16; 16 * 2 = 32
		
		
		System.out.println(x2.andThen(xx).apply(4)); // 4 * 2 = 8; 8 * 8 = 64
		
		
		
		
	}
}
