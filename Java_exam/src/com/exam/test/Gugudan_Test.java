package com.exam.test;

import java.util.Scanner;

public class Gugudan_Test {

	public static void main(String[] args) {
		
		System.out.println("구구단 출력을 해보자");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		for(int i=2; i < 10; i++) {
			System.out.println();
			System.out.println(i + " 단 ");
			for(int j = 1; j < 10; j++) {
			System.out.println(i + " * " + j + " = " + (i * j));
			}
			
		}
	}
}
