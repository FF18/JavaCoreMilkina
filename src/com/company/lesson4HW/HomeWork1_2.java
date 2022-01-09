package com.company.lesson4HW;

import java.util.Scanner;

public class HomeWork1_2 {
    public static void main(String[] args) {
        System.out.println("Enter integer Number:");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            int x = sc.nextInt();
            Integer.toBinaryString(x);
            if((x & 1) == 0) {
                System.out.println("You enter even number.");
            }else {
                System.out.println("You enter odd number.");
            }
        }else {
            System.out.println("That not integer number.");
        }
    }
}
