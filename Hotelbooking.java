package com.tka;

public class Hotelbooking {

	public static void main(String[] args) {

		byte guests = 3;
		short roomNo = 111;
		int bookingId = 1001;
		long mobileNo = 9529009727L;

		float rating = 4.5f;
		double roomPrice = 3500.75;

		char roomType = 'D';
		boolean booked = true;

		String customerName = "Vidya Jangale";
		String hotelName = "Sunrise Hotel";

		System.out.println("----- Hotel Booking Details -----");
		System.out.println("Customer Name: " + customerName);
		System.out.println("Booking ID: " + bookingId);
		System.out.println("Mobile Number: " + mobileNo);
		System.out.println("Guests: " + guests);
		System.out.println("Room Number: " + roomNo);
		System.out.println("Rating: " + rating);
		System.out.println("Room Price: " + roomPrice);
		System.out.println("Room Type: " + roomType);
		System.out.println("Booked: " + booked);
		System.out.println("Hotel Name: " + hotelName);
	}

}
