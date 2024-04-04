package com.exam.test;

public class Gugudan_Test {

	public static void main(String[] args) {
		// 2단부터 9단까지 구구단을 출력하라
		System.out.println("2 ~ 9단 까지 구구단을 출력하자!");
		
		for(int i = 2; i < 10; i++) {
			System.out.println();
			System.out.println(i + " 단");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	}
}
