package com.sap.effective;

import java.util.ArrayList;

import com.sap.effective.nestedclasses.AnonymousClass;
import com.sap.effective.nestedclasses.AnonymousClass.JustDoIt;
import com.sap.effective.nestedclasses.NonStaticMemberClassExample;
import com.sap.effective.nestedclasses.StaticMemberClassExample;

public class Main24 {

	public static void main(String[] args) {
		System.out.println(new StaticMemberClassExample("Instance A").processInformation());
		System.out.println(new StaticMemberClassExample("Instance B").processInformation());

		System.out.println(new NonStaticMemberClassExample("Instance A").processInformation());
		System.out.println(new NonStaticMemberClassExample("Instance B").processInformation());

		new ArrayList<String>().iterator();

		System.out.println(new AnonymousClass("Instance A").processInformation(new JustDoIt() {
			@Override
			public String doSomething(String information) {
				return "AnonymousClass and " + information;
			}

		}));

	}

}
