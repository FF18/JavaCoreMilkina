package com.company.lesson4ch9bitwise;

public class Bitwise3 {
    public static void main(String[] args) {
        /*операция XOR при применении 2 разов к одному и тому же
        * битовому массиву восстанавливает его исходное значение:
        * C=A^B
        * A=C^B*/
        int message =560;
        int maska = 67;
        int codedMessage = message ^ maska;
        int recivedMessage = codedMessage^maska;
        System.out.println("message = "+message);
        System.out.println("message = "+Integer.toBinaryString(message));
        System.out.println("codedMessage = "+codedMessage);
        System.out.println("codedMessage = "+Integer.toBinaryString(codedMessage));
        System.out.println("receivedMessage = "+recivedMessage);
        System.out.println("receivedMessage = "+Integer.toBinaryString(recivedMessage));
    }
}
