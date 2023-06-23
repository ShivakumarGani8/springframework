package com.springcore.reportgenerator;

public class Person {
	private String name;
	private int age;
	private Student student;
	
	public Person(int age, String name, Student student) {
		super();
		this.age = age;
		this.name = name;
		this.student=student;
	}
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
	public Student getOccupation() {
		return student;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age" + age + ", student=" + student + "]";
	}


}
