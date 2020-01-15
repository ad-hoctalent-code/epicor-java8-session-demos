package com.epicor.lambda;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		Supplier<Character> randomChars = () -> {
			Random r = new Random();
			return (char)(r.nextInt(26) + 'a');
		};
		
		for(int i = 0; i<10; i++) {
			System.out.println(randomChars.get());
		}
		
		IntSupplier randomInt = () -> {
			Random r = new Random();
			return r.nextInt(100);
		};
		
		for(int i = 0; i<10; i++) {
			System.out.println(randomInt.getAsInt());
		}
		
	}
}
