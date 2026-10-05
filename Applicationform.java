package com.tka;

public class Applicationform {

	public static void main(String[] args) {

		byte age = 22;
		short semester = 2;
		int applicationId = 1011;
		long mobileNo = 9529009727L;

		float percentage = 85.5f;
		double applicationFee = 500.50;

		char gender = 'F';
		boolean eligible = true;

		String studentName = "Vidya Jangale";
		String course = "MCA";

		System.out.println("----- Application Form -----");
		System.out.println("Student Name: " + studentName);
		System.out.println("Application ID: " + applicationId);
		System.out.println("Mobile Number: " + mobileNo);
		System.out.println("Age: " + age);
		System.out.println("Semester: " + semester);
		System.out.println("Percentage: " + percentage);
		System.out.println("Application Fee: " + applicationFee);
		System.out.println("Gender: " + gender);
		System.out.println("Eligible: " + eligible);
		System.out.println("Course: " + course);
	}

}
