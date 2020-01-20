package com.epicor.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorExample {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Joe", 87.5));
		students.add(new Student("Anne", 99.5));
		students.add(new Student("Mary", 89.0));
		students.add(new Student("John", 75.5));
		students.add(new Student("Jenny", 82.5));
		students.add(new Student("David", 70.5));
		students.add(new Student("Cloe", 97.5));
		
		Comparator<Student> c1 = Comparator.comparing((Student s) -> s.fullName);
		List<Student> sortedByName = students.stream()
										.sorted(c1)
										.collect(Collectors.toList());
		System.out.println(sortedByName);
		Comparator<Student> c2 = Comparator.comparing((Student s) -> s.GPA)
											.thenComparing(s -> s.fullName);
		
		students.stream()
		.sorted(c1)
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		System.out.println("* * * * * ");
		students.stream()
		.sorted(c2)
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}
}

class Student{
	String fullName;
	Double GPA;
	public Student() {}
	public Student(String fullName, Double gPA) {
		super();
		this.fullName = fullName;
		GPA = gPA;
	}
	
	@Override
	public String toString() {
		return "Student [fullName=" + fullName + ", GPA=" + GPA + "]";
	}

	
	
	
}