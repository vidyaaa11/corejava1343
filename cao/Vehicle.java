package com.cao;

public class Vehicle {

	int vehicleId;
	String vehicleName;
	String brand;
	String color;
	String fuelType;
	int modelYear;
	int seats;
	double price;
	String registrationNo;
	int engineCC;
	String ownerName;
	String vehicleType;

	public void start() {
		System.out.println("Vehicle is starting");
	}

	public void stop() {
		System.out.println("Vehicle is stopping");
	}

	public void applyBrake() {
		System.out.println("Brake is applied");
	}

	public void accelerate() {
		System.out.println("Vehicle is accelerating");
	}

	public void display() {
		System.out.println("Vehicle ID --> " + vehicleId);
		System.out.println("Vehicle Name --> " + vehicleName);
		System.out.println("Brand --> " + brand);
		System.out.println("Color --> " + color);
		System.out.println("Fuel Type --> " + fuelType);
		System.out.println("Model Year --> " + modelYear);
		System.out.println("Seats --> " + seats);
		System.out.println("Price --> " + price);
		System.out.println("Registration No --> " + registrationNo);
		System.out.println("Engine CC --> " + engineCC);
		System.out.println("Owner Name --> " + ownerName);
		System.out.println("Vehicle Type --> " + vehicleType);
		System.out.println("------------------");
		
		start();
		stop();
		applyBrake();
		accelerate();
	}

}
