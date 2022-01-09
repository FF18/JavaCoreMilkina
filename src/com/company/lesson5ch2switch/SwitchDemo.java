package com.company.lesson5ch2switch;

public class SwitchDemo {
    public static void main(String[] args) {
        int month = 4;
        switch (month){
            case 1, 2, 12:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Mistake - not right month.");

        }
    }
}
