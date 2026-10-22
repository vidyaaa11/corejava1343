package com.tk;

public class Library {

	int bookId = 101;
	String bookName = "Java Programming";
	String author = "James Gosling";
	String publisher = "ABC Publication";
	double price = 500;
	int totalPages = 350;
	String language = "English";
	String category = "Programming";
	String libraryName = "City Library";
	int availableBooks = 20;

	// 1. Non-para without return type
	public void display() {
		System.out.println("Book ID: " + bookId);
		System.out.println("Book Name: " + bookName);
		System.out.println("Author: " + author);
		System.out.println("Publisher: " + publisher);
		System.out.println("Price: " + price);
		System.out.println("Total Pages: " + totalPages);
		System.out.println("Language: " + language);
		System.out.println("Category: " + category);
		System.out.println("Library Name: " + libraryName);
		System.out.println("Available Books: " + availableBooks);
	}

	// 2. Para without return type
	public void showBook(String name) {
		System.out.println("Book Name: " + name);
	}

	// 3. Non-para with return type
	public int getAvailableBooks() {
		return availableBooks;
	}

	// 4. Para with return type
	public double calculateTotalPrice(int quantity, double price) {
		return quantity * price;
	}

}
