package com.company.lesson6ch3array2;

public class ArrayMany4 {
    public static void main(String[] args) {
        char[][] array = {
                {'c', 'v'},
                {'w', 'e'},
                {'z', 'o'},
                {'l', 'i'},
        };
        for (char[] row : array) {
            for (char element : row) {
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}
