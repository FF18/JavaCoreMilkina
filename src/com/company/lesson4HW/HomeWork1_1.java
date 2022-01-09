package com.company.lesson4HW;

import java.util.Scanner;

public class HomeWork1_1 {
    public static void main(String[] args) {
        System.out.println("Enter integer Number:");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            int x = sc.nextInt();
            Integer.toBinaryString(x);
            System.out.println("for even number resalt: 0");
            System.out.println("for odd number resalt: 1");
            System.out.println("result: " + (x & 1));
        }else {
            System.out.println("That not integer number.");
        }
    }
}
