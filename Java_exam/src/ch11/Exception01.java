package ch11;

import java.util.Scanner;

public class Exception01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하라");
		int num1 = s.nextInt();
		
		//try에서 예외를 던지면
		try {
			int num2 = 10 / num1;
			System.out.println(num2);
		//catch가 잡아다가 아래 e.printStackTrace()가 예외를 발생시킨다.
		} catch (Exception e) {
			System.out.println("올바른 숫자를 입력해라");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("try ~ catch 블록의 외부 문장이다.");
	}
}