package com.exam.test;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		System.out.println("아무 키나 입력 해보세요!");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		sc.next();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("hello Java!");
		}
		System.out.println();
		System.out.println("시스템을 종료 합니다!");
	}
}
