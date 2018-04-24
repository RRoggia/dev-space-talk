package com.sap.effective.objectsmanagement;

public class ChildBook extends OtherBook {

	protected ChildBook(String name) {
		super(name);
	}

	@Override
	public String getName() {
		return "Implementation ChildBook - Name: " + super.getName();
	}

}
