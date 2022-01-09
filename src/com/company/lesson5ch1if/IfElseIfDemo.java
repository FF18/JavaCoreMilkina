package com.company.lesson5ch1if;

public class IfElseIfDemo {
    public static void main(String[] args) {
        if(args[0].equals("1")){
            System.out.println("Today Monday.");
        } else if(args[0].equals("2")){
            System.out.println("Today Tuesday.");
        } else if(args[0].equals("3")){
            System.out.println("Today Wednesday.");
        } else if(args[0].equals("4")){
            System.out.println("Today Thursday.");
        } else if(args[0].equals("5")){
            System.out.println("Today Friday.");
        } else if(args[0].equals("6") || args[0].equals("7")){
            System.out.println("Today weekend.");
        }else{
            System.out.println("Mistake. We not have this day.");
        }
    }
}
