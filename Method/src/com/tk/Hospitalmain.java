package com.tk;

public class Hospitalmain {

	public static void main(String[] args) {

		Hospital h = new Hospital();
		h.display();
		h.showPatient("Amit");

		System.out.println("Fees: " + h.getFees());
		System.out.println("Total Bill: " + h.calculateBill(1000, 500));
	}
}
