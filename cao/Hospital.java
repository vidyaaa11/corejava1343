package com.cao;

public class Hospital {

	int hospitalId;
	String hospitalName;
	String patientName;
	int patientAge;
	String gender;
	String doctorName;
	String department;
	String disease;
	int roomNo;
	double billAmount;
	String address;
	long mobileNo;

	public void admitPatient() {
		System.out.println("Patient is admitted");
	}

	public void dischargePatient() {
		System.out.println("Patient is discharged");
	}

	public void checkup() {
		System.out.println("Patient is having a checkup");
	}

	public void giveMedicine() {
		System.out.println("Medicine is given to patient");
	}

	public void display() {
		System.out.println("Hospital ID --> " + hospitalId);
		System.out.println("Hospital Name --> " + hospitalName);
		System.out.println("Patient Name --> " + patientName);
		System.out.println("Patient Age --> " + patientAge);
		System.out.println("Gender --> " + gender);
		System.out.println("Doctor Name --> " + doctorName);
		System.out.println("Department --> " + department);
		System.out.println("Disease --> " + disease);
		System.out.println("Room No --> " + roomNo);
		System.out.println("Bill Amount --> " + billAmount);
		System.out.println("Address --> " + address);
		System.out.println("Mobile No --> " + mobileNo);
		System.out.println("--------------------------");
		
		admitPatient();
		dischargePatient();
		checkup();
		giveMedicine();
	}
}
