package com.cao;

public class Mainhospital {

	public static void main(String[] args) {

		Hospital h1 = new Hospital();

		h1.hospitalId = 101;
		h1.hospitalName = "City Hospital";
		h1.patientName = "Priya";
		h1.patientAge = 30;
		h1.gender = "Male";
		h1.doctorName = "Dr. Sharma";
		h1.department = "General Medicine";
		h1.disease = "Fever";
		h1.roomNo = 105;
		h1.billAmount = 2500;
		h1.address = "Pune";
		h1.mobileNo = 9876543210L;

		h1.display();
	}
}
