package com.tk;

public class Employeemain {

	public static void main(String[] args) {

		Employee e = new Employee();

		e.display();
		e.showName("Vidya");

		System.out.println("Salary: " + e.getSalary());
		System.out.println("Salary with Bonus: " + e.addBonus(35000, 5000));
	}

}
