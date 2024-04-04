package com.exam.test;

import java.util.Scanner;
//피라미드 만들기 예제
public class Loop04_Test {
	public static void main(String[] args) {
		System.out.println("숫자를 입력");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("길이 : ");
		
		int len = sc.nextInt();
		
		//초기값 i = 0, i가 len보다 작을때까지, i는 1씩 증가
		//초기식, 초건식, 증감식
		
		for(int i = 0; i < len; i++) {
			//if문으로 하나로 묶는다
			//if조건이 i 길이가 절반일때
			for(int j = 0; j < len-i-1; j++) {
				System.out.print('a');
			}
			for(int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}

			System.out.println("");
		}
		
	}
}
