package com.cao;

public class Library {

	int libraryId;
	String libraryName;
	String bookName;
	String authorName;
	String publisher;
	int totalBooks;
	int availableBooks;
	String studentName;
	int bookId;
	double bookPrice;
	String bookType;
	String location;

	public void issueBook() {
		System.out.println("Book is issued");
	}

	public void returnBook() {
		System.out.println("Book is returned");
	}

	public void searchBook() {
		System.out.println("Searching for book");
	}

	public void addBook() {
		System.out.println("New book is added");
	}

	public void display() {
		System.out.println("Library ID --> " + libraryId);
		System.out.println("Library Name --> " + libraryName);
		System.out.println("Book Name --> " + bookName);
		System.out.println("Author Name --> " + authorName);
		System.out.println("Publisher --> " + publisher);
		System.out.println("Total Books --> " + totalBooks);
		System.out.println("Available Books --> " + availableBooks);
		System.out.println("Student Name --> " + studentName);
		System.out.println("Book ID --> " + bookId);
		System.out.println("Book Price --> " + bookPrice);
		System.out.println("Book Type --> " + bookType);
		System.out.println("Location --> " + location);
		System.out.println("---------------------");

		issueBook();
		returnBook();
		searchBook();
		addBook();
	}
}
