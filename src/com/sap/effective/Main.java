package com.sap.effective;

import com.sap.effective.objectsmanagement.Book;
import com.sap.effective.objectsmanagement.OtherBook;

public class Main {

	public static void main(String[] args) {
		Book book = new Book("Book", 200);
		System.out.println(book);

		OtherBook book2 = OtherBook.create("Book 2", 300);
		System.out.println(book2);

	}

}
