package com.company.lesson5ch1if;

public class IfElseIfDemo2 {
    public static void main(String[] args) {
        if("1".equals(args[0])){
            System.out.println("Today Monday.");
        } else if("2".equals(args[0])){
            System.out.println("Today Tuesday.");
        } else if("3".equals(args[0])){
            System.out.println("Today Wednesday.");
        } else if("4".equals(args[0])){
            System.out.println("Today Thursday.");
        } else if("5".equals(args[0])){
            System.out.println("Today Friday.");
        } else if("6".equals(args[0]) || "7".equals(args[0])){
            System.out.println("Today weekend.");
        }else{
            System.out.println("Mistake. We not have this day.");
        }
    }
}
