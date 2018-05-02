package com.sap.effective.nestedclasses;

public class NonStaticMemberClassExample {

	private static int numberOfInnerClasses = 0;
	private String information;

	public NonStaticMemberClassExample(String information) {
		this.information = information;
	}

	public String processInformation() {
		return new UtilityClassOnlyRelevantForOutterClass().doSomething();

	}

	private class UtilityClassOnlyRelevantForOutterClass {

		public UtilityClassOnlyRelevantForOutterClass() {
			numberOfInnerClasses++;
		}

		private String doSomething() {
			return "Utility class " + numberOfInnerClasses + " and " + information;
		}

		/*
		 * private static void doSomethign() { //static not allowed for inner class }
		 */

	}

}
