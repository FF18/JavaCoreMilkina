package com.company.lesson5ch9debug;

public class ContinueLabel {
    public static void main(String[] args) {
        outer:
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 7; j++) {
                if (j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print((" " + i * j));
            }
        }
        System.out.println();
    }
}
