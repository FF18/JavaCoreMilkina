package com.company.lesson6ch3array2;

public class ArrayMany2 {
    public static void main(String[] args) {
        int[][] array = new int[4][];
        array[0] = new int[1];
        array[1] = new int[2];
        array[2] = new int[3];
        array[3] = new int[4];
        int i, j, k = 0;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                array[i][j] = k++;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
