package com.exam.test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		// 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해
		// 보세요.

		Scanner sc = new Scanner(System.in);
		String a = sc.next();

		// 결과를 받을 문자열 초기화
		String result = "";

		for (int i = 0; i < a.length(); i++) { // c가 소문자인지를 확인한다.
			char c = a.charAt(i); // 문자열 a에 있는 현재 인덱스 i에 해당하는 문자를 가져와 변수 c에 저장
			if (Character.isLowerCase(c)) {

				result += Character.toUpperCase(c);
			} else {
				result += Character.toLowerCase(c);
			}
		}
		System.out.println(result);
	}
}