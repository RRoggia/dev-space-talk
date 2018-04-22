package com.sap.effective.objectsmanagement;

public class OtherBook {
	private String name;
	private int pages;
	private int numberOfPositions;

	private OtherBook() {
	}

	public static OtherBook createBook(String name, int pages) {
		OtherBook otherBook = new OtherBook();
		otherBook.setName(name);
		otherBook.setPages(pages);
		return otherBook;
	}

	public static OtherBook createDigitalBook(String name, int numberOfPositions) {
		OtherBook otherBook = new OtherBook();
		otherBook.setName(name);
		otherBook.setNumberOfPositions(numberOfPositions);
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
