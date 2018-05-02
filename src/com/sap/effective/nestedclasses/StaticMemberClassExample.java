package com.sap.effective.nestedclasses;

public class StaticMemberClassExample {
	private String information;

	public StaticMemberClassExample(String information) {
		this.information = information;
	}

	public String processInformation() {
		return UtilityClassOnlyRelevantForOutterClass.doSomething(this.information);

	}

	private static class UtilityClassOnlyRelevantForOutterClass {

		private static String doSomething(String information) {
			return "Utility class 1 and " + information;
		}

	}

}
