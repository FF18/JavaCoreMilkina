package com.company.lesson4ch2increment;

import java.io.IOException;

public class AlefBet {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter simbol ");
		int x = System.in.read();
		for(int i=0; i<26; i++) {
			char c = (char)x;
			System.out.println("Code simbol "+c+" = "+x);
			x++;
		}
	}

}
