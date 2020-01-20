package com.epicor.streams;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupAndPartition {
	public static void main(String[] args) {
		Map<Integer, List<Integer>> map =
				Stream.of(2, 3, 4, 15, 18, 21, 25, 34)
				.collect(Collectors.groupingBy(i -> i/10 * 10));
		System.out.println(map);
		
		Map<Integer, Long> map2 =
				Stream.of(2, 3, 4, 15, 18, 21, 25, 34)
				.collect(Collectors.groupingBy(i -> i/ 10 * 10, Collectors.counting()));
		System.out.println(map2);
		
		Map<Integer, Map<String, List<Integer>>> map3 =
				Stream.of(2, 3, 4, 15, 18, 21, 25, 34)
				.collect(Collectors.groupingBy(i -> i/ 10 * 10, 
						Collectors.groupingBy(i -> i%2 == 0 ? "EVEN" : "ODD")));
		System.out.println(map3);
		
		Map<Integer, Map<String, List<Integer>>> map4 =
				Stream.of(2, 3, 4, 15, 18, 21, 25, 34)
				.collect(Collectors.groupingBy(i -> i/ 10 * 10, 
						TreeMap::new,
						Collectors.groupingBy(i -> i%2 == 0 ? "EVEN" : "ODD")));
		System.out.println(map4);
		
		Map<Boolean, List<Integer>> map5 = 
				Stream.of(2, 3, 4, 15, 18, 21, 25, 34)
				.collect(Collectors.partitioningBy(i -> i % 2 == 0));
		System.out.println(map5);
		
		System.out.println("* * * * * * * * * * * * * ");
		Stream.of(2, 3, 4, 15, 18, 21, 25, 34)
		.forEach(System.out::println);
		System.out.println("* * * * * Parallel Streams  * * * * * ");
		Stream.of(2, 3, 4, 15, 18, 21, 25, 34)
		.parallel()
		.forEach(System.out::println);
		
	}
}
