package com.exam.test;

//구구단 만들기
public class Gugudan {

	public static void main(String[] args) {

		System.out.println("구구단 출력");
		
		/*
		 for문에서 조건식에 조건을 줄때 상한값과 하한값이
		 제외되어야 할때는 > 또는 < 연산자를 사용하여 표현하면 되고,
		 반대로 상한값과 하한값이 명백히 표현 되어야 할떄는 >= 또는
		 <= 연산자를 사용하여 표현하면 된다.
		 */
		
		//몇단인지 표현할 외부 for문
		//2단부터 9단까지 출력
		for(int i = 2; i < 10; i++) {
			System.out.println();
			System.out.println(i + " 단 ");
			//1부터 9까지 곱셈을 수행하는 내부 for문
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
				/* 2단부터 9단까지 그리고 1~9까지
				   반복하며 곱한 결과를 위 표현식에 따라
				   표현한다.
				*/
			}
		}
	}
}