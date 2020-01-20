package com.epicor.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindingMatching {
	public static void main(String[] args) {
		IntStream s1 = IntStream.of(1,2,3,4,4,4,5,6,7,8);
		s1.findAny().ifPresent(System.out::println);
		s1 = IntStream.of(1,2,3,4,4,4,5,6,7,8);
		System.out.println(s1.findFirst());
		s1 = IntStream.of(1,2,3,4,4,4,5,6,7,8);
		System.out.println(s1.allMatch(x -> x % 2  == 0));
		s1 = IntStream.of(1,2,3,4,4,4,5,6,7,8);
		System.out.println(s1.anyMatch(x -> x % 2  == 0));
		s1 = IntStream.of(1,2,3,4,4,4,5,6,7,8);
		System.out.println(s1.noneMatch(x -> x % 2  == 0));
		
	}
}
