package com.epicor.lambda;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		int[] x = {1,2,3,4,5,6,7,8};
		
		Consumer<Integer> c1 = n -> System.out.println(n);
		IntConsumer c2 = n -> System.out.println(n);
		
		System.out.println("* * * * * Wrapper class");
		for(int n :  x) {
			c1.accept(n);
		}
		
		System.out.println("* * * * * primitive");
		for(int n :  x) {
			c2.accept(n);
		}
		
		Consumer<String> c3 = s -> System.out.println("First: " + s);
		Consumer<String> c4 = s -> System.out.println("Second: " + s);
		
		c3.andThen(c4).accept("Hello");
		
		
	}
}
