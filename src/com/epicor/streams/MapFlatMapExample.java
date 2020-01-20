package com.epicor.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapFlatMapExample {
	public static void main(String[] args) {
		IntStream s1 = IntStream.of(1,2,2,3,4,5,6);
		s1.mapToDouble(x -> x/2.3)
		.forEach(System.out::println);
		System.out.println("* * * * map * * * ");
		Stream.of("John", "Mary", "Anne", "Joe")
				.map((String name) -> new Student(name, 0.0))
				.forEach(System.out::println);
		
		List<Character> l1 = Arrays.asList('a', 'b', 'c');
		List<Character> l2 = Arrays.asList('x', 'y', 'z');
		Stream<List<Character>> s2 = Stream.of(l1, l2);
		s2.forEach(System.out::println);
		System.out.println("* * * *Flat map * * * ");
		s2 = Stream.of(l1, l2);
		s2.flatMap(l -> l.stream())
			.forEach(System.out::println);
	}
}
