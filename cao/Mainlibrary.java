package com.cao;

public class Mainlibrary {

	public static void main(String[] args) {

		Library l1 = new Library();

		l1.libraryId = 101;
		l1.libraryName = "Central Library";
		l1.bookName = "Java Programming";
		l1.authorName = "James Gosling";
		l1.publisher = "ABC Publication";
		l1.totalBooks = 1000;
		l1.availableBooks = 500;
		l1.studentName = "sonu";
		l1.bookId = 201;
		l1.bookPrice = 500;
		l1.bookType = "Technical";
		l1.location = "Pune";

		l1.display();
	}
}
