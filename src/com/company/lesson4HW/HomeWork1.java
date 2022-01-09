package com.company.lesson4HW;

import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        if(sc.hasNextInt()) {
            int num1 = sc.nextInt();
            int num2 = num1 % 2;
            if(num2 == 0) {
                System.out.println("Number "+num1+" is even number.");
            }else{
                System.out.println("Number "+num1+" is odd number.");
            }
        }else {
            System.out.println("That not integer number.");
        }
    }

}
