package com.company.lesson6ch4;

public class ArrayLength {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[][] array2 = {{1, 1, 1}, {2, 2, 2}};
        System.out.println("Length of array1 = "+array1.length);
        System.out.println("Length of array2 = "+array2.length);
        System.out.println("Length first row of array2 = "+array2[0].length);
    }
}
