package com.tk;

public class Vehicle {

	int vehicleId = 101;
	String vehicleName = "Swift";
	String brand = "Maruti";
	String color = "White";
	double price = 800000;
	String fuelType = "Petrol";
	int seatingCapacity = 5;
	int modelYear = 2025;
	String vehicleType = "Car";
	String registrationNo = "MH12AB1234";

	// 1. Non-para without return type
	public void display() {
		System.out.println("Vehicle ID: " + vehicleId);
		System.out.println("Vehicle Name: " + vehicleName);
		System.out.println("Brand: " + brand);
		System.out.println("Color: " + color);
		System.out.println("Price: " + price);
		System.out.println("Fuel Type: " + fuelType);
		System.out.println("Seating Capacity: " + seatingCapacity);
		System.out.println("Model Year: " + modelYear);
		System.out.println("Vehicle Type: " + vehicleType);
		System.out.println("Registration No: " + registrationNo);
	}

	// 2. Para without return type
	public void showBrand(String name) {
		System.out.println("Vehicle Brand: " + name);
	}

	// 3. Non-para with return type
	public String getColor() {
		return color;
	}

	// 4. Para with return type
	public double calculatePrice(double price, double tax) {
		return price + tax;
	}
}
