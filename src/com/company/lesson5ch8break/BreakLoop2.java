package com.company.lesson5ch8break;

public class BreakLoop2 {
    public static void main(String[] args) {
        for(int i=0; i<3; i++){
            System.out.print("line "+i+": ");
            for(int j=0; i<100; j++){
                if(j == 10){
                break;
                }
                System.out.print(j+" ");
            }
            System.out.println();
        }
            System.out.println("The end");
    }
}
