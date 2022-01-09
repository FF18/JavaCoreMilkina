package com.company.lesson3ch11literal;

public class Literals3 {
    public static void main(String[] args) {
        // decimal (0-9)
        int x1 = 878;
        int x2 = -878;
        int x3 = +878;

        // octal (0-7)
        int six = 06; // 6
        int seven = 07; // 7
        int eight = 010; // 8
        int nine = 011; // 9

        // hexadecimal
        int a1 = 0X0005;
        int a2 = 0x7ddfffff;
        int a3 = 0xcccccccc;

        // binary
        int i1 = 0b101;
        int i2 = 0B101;

        System.out.println("Literals third");
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(six);
        System.out.println(seven);
        System.out.println(eight);
        System.out.println(nine);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(i1);
        System.out.println(i2);
    }
}
