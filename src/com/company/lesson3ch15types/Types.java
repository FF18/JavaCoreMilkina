package com.company.lesson3ch15types;

public class Types {

	public static void main(String[] args) {
		byte a = 2;
		byte b = 3;
		b = (byte)(2*b);
		b *= 2;
		a += b;
		a = (byte) (a + b);
		System.out.println(b);
		System.out.println(a);
	}

}
