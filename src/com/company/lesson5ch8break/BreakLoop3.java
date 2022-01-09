package com.company.lesson5ch8break;

public class BreakLoop3 {
    public static void main(String[] args) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Before break");
                    if (t) {
                        break second;
                    }
                    System.out.println("Will be not this code.");
                }
                System.out.println("Will be not this code.");
            }
            System.out.println("After second block");
        }
    }
}
