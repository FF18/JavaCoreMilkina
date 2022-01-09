package com.company.lesson5ch10math;

public class Return2 {
    public static void main(String[] args) {
        double d = getRandomValue(3);
        System.out.println(d);
    }

    private static double getRandomValue(int i) {
        return Math.random() * i;
    }


}
