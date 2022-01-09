package com.company.lesson3ch16scanner;

import java.io.IOException;

public class SystemInDemo {

	// programm print number of simbol
	public static void main(String[] args) throws IOException {
		int x = System.in.read();
		char c = (char) x;
		System.out.println("Code simbol: "+c+" = "+x);
	}

}
