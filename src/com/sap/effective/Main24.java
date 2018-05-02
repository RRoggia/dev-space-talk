package com.sap.effective;

import java.util.ArrayList;

import com.sap.effective.nestedclasses.NonStaticMemberClassExample;
import com.sap.effective.nestedclasses.StaticMemberClassExample;

public class Main24 {

	public static void main(String[] args) {
		System.out.println(new StaticMemberClassExample("Instance A").processInformation());
		System.out.println(new StaticMemberClassExample("Instance B").processInformation());

		System.out.println(new NonStaticMemberClassExample("Instance A").processInformation());
		System.out.println(new NonStaticMemberClassExample("Instance B").processInformation());

		new ArrayList<String>().iterator();

	}

}
