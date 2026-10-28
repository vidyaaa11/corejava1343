package com.breakndconti;

import java.util.Scanner;

public class Studentsc {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student ID :-");
		int id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter student name:");
		String name = sc.nextLine();

		System.out.println("Enter marks:");
		double marks = sc.nextDouble();

		System.out.println("Enter Student Age :-");
		int age = sc.nextInt();
		
		sc.nextLine();

		System.out.println("Enter student Course:");
		String course = sc.nextLine();

		System.out.println("Student ID: " + id);
		System.out.println("Student Name: " + name);
		System.out.println("Marks: " + marks);
		System.out.println("Course: " + course);

		sc.close();
	}

}
