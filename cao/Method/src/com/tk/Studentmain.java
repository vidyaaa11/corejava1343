package com.tk;

public class Studentmain {

	public static void main(String[] args) {

		Student s = new Student();

		s.display();
		s.showStudent("Vidya");

		System.out.println("Course: " + s.getCourse());
		System.out.println("Total Marks: " + s.addMarks(40, 50));
	}
}
