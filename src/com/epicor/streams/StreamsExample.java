package com.epicor.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExample {
	public static void main(String[] args) {
		List<String> words = Arrays.asList(new String[] {
			"hello",null, "hi",null, "Hola"	
		});
		
		System.out.println("*****S1*****");
		Stream<String> s1 = words.stream();
		s1.forEach(System.out::println);
		
		s1 = words.stream();
		
		Stream<String> s2 = Stream.of("hello",null, "hi",null, "Hola");
		
		System.out.println("*****S2*****");
		s2.filter(s -> s != null)
			.forEach(System.out::println);
		
		System.out.println("*****S3*****");
		IntStream s3 = IntStream.range(1, 5);
		s3.forEach(System.out::println);
		
		System.out.println("*****S4*****");
		Stream<Double> s4 = Stream.generate(() -> Math.random()).limit(10);
		s4.forEach(System.out::println);
		
		String[]arr = new String[] {
				"hello",null, "hi",null, "Hola"	
			};
		
		System.out.println("*****S5*****");
		Stream<String> s5 = Stream.of(arr);
		s5.forEach(System.out::println);
		
		System.out.println("*****S6*****");
		IntStream s6 = IntStream.rangeClosed(1, 5);
		s6.forEach(System.out::println);
		
		int[]x = {1,2,3,4,5};
//		Stream<Integer> s7 = Stream.of(x); // compilation fails
		
		System.out.println("*****Words2*****");
//		List<String> words2 = Arrays.asList(new String[] {
//				"hello",null, "hi",null, "Hola"	
//			});
		List<String> words2 = new ArrayList<String>();
		words2.add("Hello");
		words2.add(null);
		words2.add("Hi");
		
			
		words2.removeIf(s -> s == null);
		words2.forEach(System.out::println);
		
		System.out.println("*****Words3*****");
		List<String> words3 = new ArrayList<String>();
		words3.add("Hello");
		words3.add("Hi");
		words3.add("Hi");
		words3.add("Hi");
		words3.add("Hello");
		words3.forEach(System.out::println);
		System.out.println("*****Words3 distict*****");
		
		Stream<String>s8 = words3.stream();
		s8.distinct()
			.forEach(System.out::println);
		
		
		

		
		
		
		
		
		

		
		
		
		
	}
}
