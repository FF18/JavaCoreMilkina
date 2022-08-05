package com.company.lesson6ch3array2;

public class ArrayMany3 {
    public static void main(String[] args) {
        double[][] arrayTwoD = {
                {5, 3, 2},
                {4, 8, 9, 12},
                {14, 3},
                {7, 5, 11, 17}
        };
        for(double[] arrayOneD: arrayTwoD){
            for(double element: arrayOneD){
                System.out.print(element+"  ");
            }
            System.out.println();
        }
    }
}
