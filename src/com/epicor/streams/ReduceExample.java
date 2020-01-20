package com.epicor.streams;

import java.util.stream.IntStream;

public class ReduceExample {
public static void main(String[] args) {
	IntStream s1 = IntStream.of(1,2,2,3,4,5,6);
	System.out.println(s1.reduce((sum, n) -> sum + n));
	
	s1 = IntStream.of(1,2,2,3,4,5,6);
	System.out.println(s1.reduce(0, (sum, n) -> sum + n));
	s1 = IntStream.of(1,2,2,3,4,5,6);
	System.out.println(s1.reduce(10, (sum, n) -> sum + n));
}
}
