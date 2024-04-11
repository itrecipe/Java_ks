package com.exam.test;

public class Calculate {
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public double add(double num1, double num2) {
		return num1 + num2;
	}
	
	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		double c = 11.12;
		double d = 21.34;
		
		Calculate obj = new Calculate();
		System.out.println(obj.add(a, b));
		System.out.println(obj.add(c, d));
		
	}
}
