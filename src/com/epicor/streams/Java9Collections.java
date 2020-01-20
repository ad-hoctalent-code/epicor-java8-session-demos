package com.epicor.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java9Collections {
	public static void main(String[] args) {
		Stream<Integer> s1 = Stream.of(4,4,4,5,6,7,8,9,10);
		List<Integer> l1 = s1.takeWhile(x -> (x / 4 == 1))
					.collect(Collectors.toList());
		System.out.println(l1);
		
		s1 = Stream.of(4,4,4,5,6,7,8,9,10);
		List<Integer> l2 = s1.dropWhile(x -> (x / 4 == 1))
					.collect(Collectors.toList());
		System.out.println(l2);
	}
}
