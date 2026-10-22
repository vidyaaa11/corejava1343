package com.tk;

public class Librarymain {

	public static void main(String[] args) {

		Library l = new Library();
		l.display();
		l.showBook("Java Programming");

		System.out.println("Available Books: " + l.getAvailableBooks());
		System.out.println("Total Price: " + l.calculateTotalPrice(3, 500));
	}

}
