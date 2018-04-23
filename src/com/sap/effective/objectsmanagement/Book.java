package com.sap.effective.objectsmanagement;

public class Book {
	private String name;
	private int pages;
	private int totalPosition;

	public Book(String name, int pages) {
		this.name = name;
		this.pages = pages;
	}

	/*public Book(String name, int totalPosition) {
		this.name = name;
		this.totalPosition = totalPosition;
	}*/

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

	public int getTotalPosition() {
		return totalPosition;
	}

	public void setTotalPosition(int totalPosition) {
		this.totalPosition = totalPosition;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", pages=" + pages + ", totalPosition=" + totalPosition + "]";
	}

}
