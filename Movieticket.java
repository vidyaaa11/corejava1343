package com.tka;

public class Movieticket {

	public static void main(String[] args) {

		byte tickets = 3;
		short seatNo = 25;
		int ticketId = 1011;
		long mobileNo = 9529009727L;

		float rating = 4.5f;
		double ticketPrice = 250.50;

		char screen = 'A';
		boolean confirmed = true;

		String customerName = "Vidya Jangale";
		String movieName = "Avengers";

		System.out.println("----- Movie Ticket Details -----");
		System.out.println("Customer Name: " + customerName);
		System.out.println("Ticket ID: " + ticketId);
		System.out.println("Mobile Number: " + mobileNo);
		System.out.println("Tickets: " + tickets);
		System.out.println("Seat Number: " + seatNo);
		System.out.println("Rating: " + rating);
		System.out.println("Ticket Price: " + ticketPrice);
		System.out.println("Screen: " + screen);
		System.out.println("Confirmed: " + confirmed);
		System.out.println("Movie Name: " + movieName);
	}
}
