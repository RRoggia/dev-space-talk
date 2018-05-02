package com.sap.effective;

import com.sap.effective.nestedclasses.StaticMemberClassExample;

public class Main24 {

	public static void main(String[] args) {
		System.out.println(new StaticMemberClassExample("Instance A").processInformation());
		System.out.println(new StaticMemberClassExample("Instance B").processInformation());
	}

}
