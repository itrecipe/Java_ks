package com.exam.test;

public class Diamond {
	//중첩 for문을 활용하여 다이아몬드를 찍어보기
	public static void main(String[] args) {
		
		//다이아몬드 상단부
		for(int i = 0; i < 10; i++) {
			for(int j = i; j < 10; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for(int j = 0; j < i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//다이아몬드 하단부
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = i; j < 10; j++) {
				System.out.print("*");
			}
			for(int j = i + 1; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
