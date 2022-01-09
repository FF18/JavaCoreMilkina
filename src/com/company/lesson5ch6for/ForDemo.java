package com.company.lesson5ch6for;

public class ForDemo {
    public static void main(String[] args) {
        for (int i = 1, j = 10; i < j; i++, j--) {
            System.out.println("from i"+i+" to j "+j);
        }
        System.out.println();
        char symbol = 'h';
        char sim = 'a';
        for(int i=0; i<5; i++){
            System.out.print(symbol++ +" ");
        }
            System.out.println();
        for(int i=0; i<5; i++){
            System.out.print(" "+sim++);
        }

    }
}
