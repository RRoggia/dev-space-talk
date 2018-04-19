package com.sap.effective.objectsmanagement;

public class OtherBook {

	private String name;
	private int pages;

	private OtherBook(String name, int pages) {
		this.name = name;
		this.pages = pages;
	}

	public static OtherBook create(String name, int pages) {
		return new OtherBook(name, pages);
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

	@Override
	public String toString() {
		return "OtherBook [name=" + name + ", pages=" + pages + "]";
	}

}
