package com.encapsulation;

public class Employeemain {
	
	public static void main(String[] args) {
		Employee e = new Employee();
		
		e.setEmployeeId(101);
		e.setEmployeeName("Vidya");
		e.setAge(22);
		e.setDepartment("IT");
		e.setDesignation("Java Developer");
		e.setSalary(55000);
		e.setMobileNumber(7898546512l);
		e.setEmail("vidya@gmail.com");
		e.setAddress("Pune");
		e.setGender("female");
		e.setCompanyName("Abc company");
		e.setExperience(2);
		e.setEducation("MCA");
		e.setCity("pune");
		e.setPermanent(true);
		
		System.out.println("Employee ID:- " + e.getEmployeeId());
		 System.out.println("Employee Name: " + e.getEmployeeName());
	        System.out.println("Age: " + e.getAge());
	        System.out.println("Department: " + e.getDepartment());
	        System.out.println("Designation: " + e.getDesignation());
	        System.out.println("Salary: " + e.getSalary());
	        System.out.println("Mobile Number: " + e.getMobileNumber());
	        System.out.println("Email: " + e.getEmail());
	        System.out.println("Address: " + e.getAddress());
	        System.out.println("Gender: " + e.getGender());
	        System.out.println("Company Name: " + e.getCompanyName());
	        System.out.println("Experience: " + e.getExperience());
	        System.out.println("Education: " + e.getEducation());
	        System.out.println("City: " + e.getCity());
	        System.out.println("Permanent Employee: " + e.isPermanent());
	}

}
