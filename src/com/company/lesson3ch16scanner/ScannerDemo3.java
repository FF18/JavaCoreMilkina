package com.company.lesson3ch16scanner;

import java.util.Scanner;

public class ScannerDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter double number: ");
		String i = sc.nextLine();
		String f = sc.nextLine();
		System.out.println(i);
		System.out.println(f);
		System.out.println(i+f);
	}

}
