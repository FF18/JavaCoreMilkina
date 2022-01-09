package com.company.lesson5ch4while;

public class Nobody {
    public static void main(String[] args) {
    int i=100, j=200; // search middle from i and j
    while(++i<--j) ; // loop without body
        System.out.println("middle number "+i);
    }

}
