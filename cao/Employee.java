package com.cao;

public class Employee {

	int employeeId;
	String employeeName;
	int age;
	String gender;
	String department;
	String designation;
	double salary;
	long mobileNo;
	String email;
	String companyName;
	String address;
	int experience;

	public void work() {
		System.out.println("Employee is working");
	}

	public void attendMeeting() {
		System.out.println("Employee is attending meeting");
	}

	public void completeTask() {
		System.out.println("Employee is completing task");
	}

	public void takeLeave() {
		System.out.println("Employee is taking leave");
	}

	public void display() {
		System.out.println("Employee ID --> " + employeeId);
		System.out.println("Employee Name --> " + employeeName);
		System.out.println("Age --> " + age);
		System.out.println("Gender --> " + gender);
		System.out.println("Department --> " + department);
		System.out.println("Designation --> " + designation);
		System.out.println("Salary --> " + salary);
		System.out.println("Mobile No --> " + mobileNo);
		System.out.println("Email --> " + email);
		System.out.println("Company Name --> " + companyName);
		System.out.println("Address --> " + address);
		System.out.println("Experience --> " + experience);
		System.out.println("-----------------------");
		
		work();
		attendMeeting();
		completeTask();
		takeLeave();
	}

}
