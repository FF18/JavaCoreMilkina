package com.company.lesson5ch1if;

public class IfDemo {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        if(number % 2 != 0){
            System.out.println("event number: " + number);
        }
    }
}
