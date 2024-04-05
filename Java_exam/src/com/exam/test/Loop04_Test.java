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
				System.out.print(' ');
			}
			for(int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			
			
			//바깥쪽 for문은 역삼각형의 높이를 결졍한다.
			for(int i1 = 0; i1 < len; i1++) { //여기서 변수 i는 현재 줄 번호를 의미 한다.
				for(int j1 = 0; j1 < i; j1++) { //공백을 만들어주는 for문
					System.out.print(" ");
				}
				//해당 코드는 다이아몬드나 피라미드 같은 패턴을 그리는데 자주 사용되는 로직의 일부일 수 있음
				//변수 j는 각 줄에 별(*)을 찍기 위한 반복문 변수
				for(int j1 = 0; j1 < (2 * len) - 1 - (i1 * 2); j1++) { //실질적으로 *을 찍는 for문
					/* (2 * len) - 1 가장 긴줄에 찍히는 별의 개수 
						예를 들면 len의 입력 값이 5일때 가장 긴줄에는 
						2 * 5 - 1 = 9개의 별이 찍힌다.

						(i*2)는 별의 개수를 줄여주는것
						len이 5인 경우로 예를 들면

						(예시)
						첫번째 줄 (i = 0)에는 9 - (0 * 2) = 9개의 별이 찍힌다.
						두번째 줄 (i = 1)에는 9 - (1 * 2) = 7개의 별이 찍힌다.
						세번째 줄 (i = 2)에는 9 - (2 * 2) = 5개의 별이 찍힌다.

						이런식으로 각 줄 마다 별의 개수가 줄어들면서 다이아몬드나 
						피라미드 모양을 만들수도 있다고 한다.

					 */

					System.out.print("*");
				}
				System.out.println("");
			}

		}
	}
}