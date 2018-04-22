package com.sap.effective;

import com.sap.effective.objectsmanagement.Book;
import com.sap.effective.objectsmanagement.OtherBook;

public class Main {

	public static void main(String[] args) {
		Book book = new Book("Book", 200);
		System.out.println(book);

		OtherBook book2 = OtherBook.createBook("Book 2", 300);
		OtherBook digitalBook = OtherBook.createDigitalBook("Digital Book", 5000);
		System.out.println(book2);
		System.out.println(digitalBook);

	}

}
