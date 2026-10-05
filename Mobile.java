package com.tka;

public class Mobile {

	public static void main(String[] args) {

		byte ram = 8;
		short storage = 128;
		int modelNo = 1011;
		long mobileNo = 9529009727L;

		float screenSize = 6.5f;
		double price = 45000.50;

		char rating = 'A';
		boolean available = true;

		String brand = "Samsung";
		String model = "Galaxy";

		System.out.println("----- Mobile Phone Details -----");
		System.out.println("Brand: " + brand);
		System.out.println("Model Number: " + modelNo);
		System.out.println("Mobile Number: " + mobileNo);
		System.out.println("RAM: " + ram);
		System.out.println("Storage: " + storage);
		System.out.println("Screen Size: " + screenSize);
		System.out.println("Price: " + price);
		System.out.println("Rating: " + rating);
		System.out.println("Available: " + available);
		System.out.println("Model: " + model);
	}
}
