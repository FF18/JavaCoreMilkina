package com.company.lesson5ch2switch;

public class SwitchDemo3 {
    public static void main(String[] args) {
        switch (args[0]) {
            case "tomato":
                System.out.print("tomato ");
                break;
            case "potato":
                System.out.print("potato ");
                break;
            case "cucumber":
                System.out.print("cucumber ");
                break;
            default:
                System.out.println("any");
        }
    }
}
