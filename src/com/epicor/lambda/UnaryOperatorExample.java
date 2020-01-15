package com.epicor.lambda;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
	public static void main(String[] args) {
		int[] x = {1,2,3,4,5,6,7,8};
		UnaryOperator<Integer> un1 = n -> n * 2;
		int sum = 0;
		for(int n :  x) {
			sum += un1.apply(n);
		}
		
		UnaryOperator<String> un2 = s -> s.toUpperCase();	
		
		System.out.println(sum);
		
		System.out.println(un2.apply("Hello World"));
		
	}
}
