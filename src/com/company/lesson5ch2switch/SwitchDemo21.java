package com.company.lesson5ch2switch;

public class SwitchDemo21 {
    public static void main(String[] args) {
        switch(args[0]){
            case "1":
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
            case "3":
                System.out.println("Wednesday");
                break;
            case "4":
                System.out.println("Thursday");
                break;
            case "5":
                System.out.println("Friday");
                break;
            case "6":
            case "7":
//            case "6", "7": // possible yet
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Mistake");
        }
    }
}
