package com.cao;

public class Student {

	int studentId;
	String studentName;
	int age;
	String gender;
	String course;
	String collegeName;
	String email;
	long mobileNo;
	int rollNo;
	double fees;
	String address;
	int marks;

	public void study() {
		System.out.println("Student is studying");
	}

	public void attendLecture() {
		System.out.println("Student is attending lecture");
	}

	public void submitAssignment() {
		System.out.println("Student is submitting assignment");
	}

	public void giveExam() {
		System.out.println("Student is giving exam");
	}

	public void display() {
		System.out.println("Student ID --> " + studentId);
		System.out.println("Student Name --> " + studentName);
		System.out.println("Age --> " + age);
		System.out.println("Gender --> " + gender);
		System.out.println("Course --> " + course);
		System.out.println("College Name --> " + collegeName);
		System.out.println("Email --> " + email);
		System.out.println("Mobile No --> " + mobileNo);
		System.out.println("Roll No --> " + rollNo);
		System.out.println("Fees --> " + fees);
		System.out.println("Address --> " + address);
		System.out.println("Marks --> " + marks);
		System.out.println("-------------------");
		
		study();
		attendLecture();
		submitAssignment();
		giveExam();
	}

}
