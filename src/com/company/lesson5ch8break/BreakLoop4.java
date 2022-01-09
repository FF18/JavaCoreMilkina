package com.company.lesson5ch8break;

public class BreakLoop4 {
    public static void main(String[] args) {
        outer:
        for(int i=0; i<3; i++){
            System.out.print("line "+i+": ");
            for(int j=0; i<100; j++){
                if(j == 10){
                break outer; // out from two loops
                }
                System.out.print(j+" ");
            }
            System.out.println();
        }
            System.out.println("The end");
    }
}
