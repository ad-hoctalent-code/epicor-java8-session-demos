package com.epicor.streams;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.age);
//		System.out.println(p.name.toUpperCase());
		System.out.println(p);
		Optional<Person> op = Optional.empty();
		System.out.println(op);
//		System.out.println(op.get());
		if(op.isPresent()) {
			System.out.println("isPresent");
			System.out.println(op.get());
		}
		Optional<Person> op2 = Optional.ofNullable(new Person());
		if(op2.isPresent()) {
			System.out.println("op2 isPresent");
			System.out.println(op2.get());
		}
		Person p3 = new Person("John", "Smith", 25);
		op2 = Optional.of(p3);
		System.out.println(op2.get());
		
//		Optional<Person> op3 = null;
		Optional<Person> op3 = Optional.empty();
		System.out.println("* * * * *  Or Else* * * * ");
		System.out.println(op3.orElse(new Person("Default", "Default",0)));
		System.out.println("* * * * *  Or ElseGet* * * * ");
		System.out.println(op3.orElseGet(() -> new Person("Default2", "Default2", 0)));
//		System.out.println(op3.orElseThrow(()-> new IllegalArgumentException("No Value")));
		
		Optional<String> so = Optional.empty();
		System.out.println(so);
//		so.get();
		System.out.println(so.orElse("Default String"));
		System.out.println(so.orElseGet(()->"Default String"));
		
		Optional<String> so2 = Optional.ofNullable("from nullable");
		System.out.println(so2.get());
		
		
		
		
	}
}

class Person{
	String name;
	String lastName;
	int age;
	public Person() {}
	public Person(String name, String lastName, int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	
}
