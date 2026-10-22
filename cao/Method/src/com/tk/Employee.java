package com.tk;

public class Employee {


    int employeeId = 101;
    String employeeName = "Vidya";
    int age = 25;
    String department = "IT";
    double salary = 35000;
    String designation = "Developer";
    String companyName = "ABC Company";
    String email = "rahul@gmail.com";
    long mobileNo = 9876543210L;
    String city = "Pune";

    // 1. Non-para without return type
    public void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
        System.out.println("Company: " + companyName);
        System.out.println("Email: " + email);
        System.out.println("Mobile No: " + mobileNo);
        System.out.println("City: " + city);
    }

    // 2. Para without return type
    public void showName(String name) {
        System.out.println("Employee Name: " + name);
    }

    // 3. Non-para with return type
    public double getSalary() {
        return salary;
    }

    // 4. Para with return type
    public double addBonus(double salary, double bonus) {
        return salary + bonus;
    }

}
