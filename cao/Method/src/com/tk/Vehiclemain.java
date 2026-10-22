package com.tk;

public class Vehiclemain {

	public static void main(String[] args) {

		Vehicle v = new Vehicle();
		v.display();
		v.showBrand("Maruti");

		System.out.println("Color: " + v.getColor());
		System.out.println("Price with Tax: " + v.calculatePrice(800000, 40000));
	}
}
