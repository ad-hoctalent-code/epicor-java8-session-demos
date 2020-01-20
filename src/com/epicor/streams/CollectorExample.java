package com.epicor.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorExample {
	 public static void main(String[] args) {
		 
		List<Integer> list = Stream.of(1,2,2,3,4,5,6)
							.collect(() -> new ArrayList<Integer>(),
									(l, i) -> l.add(i),
									(l1, l2) -> l1.addAll(l2));
		System.out.println(list);
		list = Stream.of(1,2,2,3,4,5,6)
				.collect(ArrayList::new,
						ArrayList::add,
						ArrayList::addAll);
		
		System.out.println(list);
		list = Stream.of(1,2,2,3,4,5,6)
				.collect(Collectors.toList());
		
		System.out.println(list);
		
		
	}
}
