package com.tk;

public class Hospital {

	int patientId = 101;
	String patientName = "Sonu";
	int age = 30;
	String gender = "Female";
	String disease = "Fever";
	String doctorName = "Dr. Sharma";
	String hospitalName = "City Hospital";
	String department = "General";
	double fees = 1000;
	String roomNo = "205";

	// 1. Non-para without return type
	public void display() {
		System.out.println("Patient ID: " + patientId);
		System.out.println("Patient Name: " + patientName);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
		System.out.println("Disease: " + disease);
		System.out.println("Doctor Name: " + doctorName);
		System.out.println("Hospital Name: " + hospitalName);
		System.out.println("Department: " + department);
		System.out.println("Fees: " + fees);
		System.out.println("Room No: " + roomNo);
	}

	// 2. Para without return type
	public void showPatient(String name) {
		System.out.println("Patient Name: " + name);
	}

	// 3. Non-para with return type
	public double getFees() {
		return fees;
	}

	// 4. Para with return type
	public double calculateBill(double fees, double medicineCost) {
		return fees + medicineCost;
	}
}
