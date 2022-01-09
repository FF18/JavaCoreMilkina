package com.company.lesson4HW;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();
        int num1 = a<0 ? -a : a;
        System.out.println("Modul first number "+num1);
        int num2 = b<0 ? -b : b;
        System.out.println("Modul second number "+num2);
        int num3 = c<0 ? -c : c;
        System.out.println("Modul third number "+num3);
        if(num1<num2){
            if(num1<num3){
                System.out.println(a+" first number modul is minimum");
            }else{
                System.out.println(c+" third number modul is minimum");
            }
        }else {
            if(num2<num3){
                System.out.println(b+" second number modul is minimum");
            }else{
                System.out.println(c+" third number modul is minimum");
            }
        }
    }
}
