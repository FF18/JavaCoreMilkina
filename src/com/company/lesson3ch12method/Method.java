package com.company.lesson3ch12method;

public class Method {

	public static void main(String[] args) {
		double result = squer(5, 2.3, 4.5);
		System.out.println(result);
		double result2 = squerCircl(5);
		System.out.println(result2);
		int result3 = (int) squer2(3, 2);
		System.out.println(result3);
		int result4 = (int) squer2(4, 3);
		System.out.println(result4);
		int num1 =sum(5,3);
		System.out.println(num1);
		int num2 = minus(8, 5);
		System.out.println(num2);
	}
	
	static double squer(int width, double hight, double deaps) {
		return width*hight*deaps;
	}
	static double squerCircl(int r) {
		return (int)(Math.PI*r*r);
	}
	static double squer2(int d, int n) {
		return Math.pow(d, n)*2;
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	public static int minus(int a, int b) {
		return a-b;
	}

}
