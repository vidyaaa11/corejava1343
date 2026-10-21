package com.cao;

public class Mainemployee {

	public static void main(String[] args) {

		Employee e1 = new Employee();

		e1.employeeId = 101;
		e1.employeeName = "Vidya";
		e1.age = 22;
		e1.gender = "Female";
		e1.department = "IT";
		e1.designation = "Software Developer";
		e1.salary = 55000;
		e1.mobileNo = 9876543210L;
		e1.email = "vidya@gmail.com";
		e1.companyName = "ABC Company";
		e1.address = "Pune";
		e1.experience = 2;

		e1.display();
	}

}
