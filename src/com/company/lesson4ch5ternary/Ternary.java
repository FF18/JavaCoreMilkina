package com.company.lesson4ch5ternary;

import java.util.Scanner;

public class Ternary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        if(sc.hasNextInt()) {
            int num = sc.nextInt();
            int k;
            k=num < 0 ? -num : num;
            System.out.println(num+" modul this number is "+k);
//			if(num<0) {
//				num=-num;
//				System.out.println("Number of modul "+num);
//			}else {
//				num=num;
//				System.out.println("Number of modul "+num);
//			}
        }else {
            System.out.println("That not integer number.");
        }
    }

}
