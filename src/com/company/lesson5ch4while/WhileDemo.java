package com.company.lesson5ch4while;

public class WhileDemo {
    public static void main(String[] args) {
        int task = 1;
        while (task < 11) {
            System.out.println("to big number " + task++);
        }
        System.out.println();
        int n = 10;
        while (n > 0) {
            System.out.println("to small number " + n--);
        }
    }
}
