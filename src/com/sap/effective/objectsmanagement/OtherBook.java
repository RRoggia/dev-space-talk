package com.sap.effective.objectsmanagement;

import java.util.HashMap;
import java.util.Map;

public class OtherBook {
	private String name;
	private int pages;
	private int numberOfPositions;
	private static Map<String, OtherBook> books = new HashMap<>();

	protected OtherBook(String name) {
		this.name = name;
	}

	public static OtherBook createBook(String name, int pages) {

		if (books.containsKey(name))
			return books.get(name);

		OtherBook otherBook = name.toLowerCase().contains("child") ? new ChildBook(name) : new OtherBook(name);

		otherBook.setPages(pages);

		books.put(name, otherBook);
		return otherBook;
	}

	public static OtherBook createDigitalBook(String name, int numberOfPositions) {
		if (books.containsKey(name))
			return books.get(name);

		OtherBook otherBook = new OtherBook(name);
		otherBook.setNumberOfPositions(numberOfPositions);

		books.put(name, otherBook);
		return otherBook;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getNumberOfPositions() {
		return numberOfPositions;
	}

	public void setNumberOfPositions(int numberOfPositions) {
		this.numberOfPositions = numberOfPositions;
	}

	@Override
	public String toString() {
		return "OtherBook [name=" + name + ", pages=" + pages + ", numberOfPositions=" + numberOfPositions + "]";
	}

}
