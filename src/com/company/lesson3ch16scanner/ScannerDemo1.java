package com.company.lesson3ch16scanner;

import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer number: ");
		// true, если и только если следующий токен этого сканера является int
		if(sc.hasNextInt()) {
			int i = sc.nextInt();
			System.out.println(i);
		} else {
			System.out.println("You enter not integer number.");
		}
	}

}
