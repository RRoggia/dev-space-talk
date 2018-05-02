package com.sap.effective.nestedclasses;

public class AnonymousClass {

	private String information;

	public AnonymousClass(String information) {
		this.information = information;
	}

	public interface JustDoIt {
		String doSomething(String information);
	}

	public String processInformation(JustDoIt doIt) {
		return doIt.doSomething(this.information);
	}

}
