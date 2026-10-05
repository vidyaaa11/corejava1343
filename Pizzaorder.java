package com.tka;

public class Pizzaorder {

	public static void main(String[] args) {

		byte quantity = 3;
		short tableNo = 15;
		int orderId = 1001;
		long mobileNo = 9529009727L;

		float discount = 10.5f;
		double totalBill = 1250.75;

		char foodType = 'V';
		boolean paid = true;

		String customerName = "Vidya Jangale";
		String foodName = "Pizza";

		System.out.println("----- Restaurant Order -----");
		System.out.println("Customer Name: " + customerName);
		System.out.println("Order ID: " + orderId);
		System.out.println("Mobile Number: " + mobileNo);
		System.out.println("Quantity: " + quantity);
		System.out.println("Table Number: " + tableNo);
		System.out.println("Discount: " + discount);
		System.out.println("Total Bill: " + totalBill);
		System.out.println("Food Type: " + foodType);
		System.out.println("Paid: " + paid);
		System.out.println("Food Name: " + foodName);
	}

}
