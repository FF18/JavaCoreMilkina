package com.company.lesson3ch16scanner;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter double number: ");
		// true, если и только если следующий токен этого сканера является double
		if(sc.hasNextDouble()) {
			double i = sc.nextDouble();
			System.out.println(i);
		} else {
			System.out.println("You enter not double number.");
		}
	}

}
