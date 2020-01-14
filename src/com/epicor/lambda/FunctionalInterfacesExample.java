package com.epicor.lambda;

public class FunctionalInterfacesExample {
	public static void main(String[] args) {
		Interface1 obj1 = new Concrete1();
		Concrete1 obj2 = new Concrete1();
		obj1.method1();
		obj1.method2();
		obj1.method4();
		Interface1.method3();
		
		obj2.method6();
		Concrete1.method6();
	}
}

@FunctionalInterface
interface Interface1{
	void method1();
	
//	void method5();
	
	default void method2() {
		System.out.println("New default method in Java 8");
	}
	
	default void method4() {
		System.out.println("New default method in Java 8");
	}
	
	
	static void method3() {
		System.out.println("New static method in java 8");
	}
	
	String toString();
}

class Concrete1 implements Interface1{

	@Override
	public void method1() {
		System.out.println("Concrete method");
	}
	
	@Override
	public void method2() {
		System.out.println("Concrete method2");
	}
	
	public static void method6() {
		System.out.println("Static method in class");
	}
	
}


@FunctionalInterface
interface Interface2 extends Interface1{
	
}


