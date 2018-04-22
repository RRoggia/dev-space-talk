package com.sap.effective;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerExample {

	public static void main(String[] args) {
		BigInteger integer = new BigInteger(10, 10, new Random());
		System.out.println(integer);

	}

}
