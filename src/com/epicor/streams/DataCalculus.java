package com.epicor.streams;

import java.util.stream.IntStream;

public class DataCalculus {
	public static void main(String[] args) {
		IntStream s1 = IntStream.of(1,2,2,3,4,5,6);
		System.out.println(s1.min());
		s1 = IntStream.of(1,2,2,3,4,5,6);
		System.out.println(s1.max());
		s1 = IntStream.of(1,2,2,3,4,5,6);
		System.out.println(s1.count());
		s1 = IntStream.of(1,2,2,3,4,5,6);
		System.out.println(s1.average());
		s1 = IntStream.of(1,2,2,3,4,5,6);
		System.out.println(s1.sum());
		
		System.out.println("* * * Peek * * * ");
		s1 = IntStream.of(1,2,2,3,4,5,6);
		s1.peek(System.out::println)
			.forEach(System.out::println)
//			.forEach(System.out::println)
			;
		
	}
}
