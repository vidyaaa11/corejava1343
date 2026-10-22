package com.tk;

public class Student {

	int studentId = 101;
	String studentName = "Vidya";
	int age = 22;
	String course = "Java Programming";
	double fees = 50000;

	// 1. Non-parameterised without return type
	public void display() {
		System.out.println("Student ID: " + studentId);
		System.out.println("Student Name: " + studentName);
		System.out.println("Age: " + age);
		System.out.println("Course: " + course);
		System.out.println("Fees: " + fees);
	}

	// 2. Para without return type
	public void showStudent(String name) {
		System.out.println("Student Name: " + name);
	}

	// 3. Non-para with return type
	public String getCourse() {
		return course;
	}

	// 4. Para with return type
	public int addMarks(int a, int b) {
		return a + b;
	}

}
