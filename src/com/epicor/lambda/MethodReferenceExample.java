package com.epicor.lambda;

import java.util.Locale;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceExample {
	
	public static void main(String[] args) {
		System.out.println("* * * * * * ");
		Consumer<String> c1 = s -> System.out.println("Hello: " + s);
		c1.accept("John");
		c1 = System.out::println;
		c1.accept("Hello: John");
		
		MethodReference mr = new MethodReference();
		System.out.println("* * * * Instance * * ");
		Function<MethodReference, Integer> f1 = obj -> obj.getRandomNumber();
		Function<MethodReference, Integer> f2 = MethodReference::getRandomNumber;
		
		System.out.println(f1.apply(mr));
		System.out.println(f2.apply(mr));
		
		System.out.println("* * * Static * * * ");
		Supplier<Integer> c2 = MethodReference::getRandomNumber2;
		System.out.println(c2.get());
		
		System.out.println("* * * Constructor * * * ");
		
		Function<String, Integer> f3 = Integer::new;
		System.out.println(f3.apply("120"));
		
		
		BiFunction<String, String, Locale> bi1 = Locale::new;
		System.out.println(bi1.apply("en", "US"));
		
		
		
		
	}
	
}


class MethodReference{
	Integer getRandomNumber() {
		return new Random().nextInt();
	}
	
	static Integer getRandomNumber2() {
		return new Random().nextInt();
	} 
}
