package com.epicor.lambda;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		Predicate<String> startsWithA = s -> s.startsWith("A");
		System.out.println("Starts with A?");
		System.out.println(startsWithA.test("Aldo"));
		
		Predicate<String> endsWithA = s -> s.endsWith("A");
		System.out.println(endsWithA.test("ROSALBA"));
		
		System.out.println(startsWithA.and(endsWithA).test("ANA"));
		
		System.out.println(startsWithA.or(endsWithA).test("ALBERTO"));
		
		Predicate<String> isHello = Predicate.isEqual("hello");
		
		System.out.println(isHello.test("hello"));
		System.out.println(isHello.test("hi"));
		
		
		
		
	}
}
