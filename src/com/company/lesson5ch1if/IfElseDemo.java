package com.company.lesson5ch1if;

import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer number from 0 to 10");
        if(sc.hasNextInt()){
            int number = sc.nextInt();
            compareNumber(number);
        }else{
            System.out.println("That not enteger number.");
        }
    }

    private static void compareNumber(int number) {
        if(number >=0 && number <=10){
            System.out.println("Number from 0 to 10");
        }else{
            System.out.println("Number less 0 or more 10");
        }
    }
}
