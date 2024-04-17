package ch11;

import java.util.Scanner;

public class Exception04 {

	//throws는 남이 대신 예외를 처리해주는것 이라고 생각하면 된다.
	static void check(int num) throws NumberFormatException {
		if(num < 0)
			/*
			throw는 강제 예외 발생을 시키고 종료됨,
			
			throw는 전파라는 특성이 있어서 가장 가까운
			catch문을 찾아간다.
			*/
			throw new NumberFormatException("0보다 작다.");
		else
			System.out.println(num);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 입력");
		int num = s.nextInt();
		
		try {
			/* 아래 코드는 이상하다고 하셨다
			if(num < 0)
				throw new NumberFormatException("0보다 작다");
			else
				System.out.println(num);
			*/
			check(num);
		}catch (NumberFormatException e) {
			System.out.println("예외 발생 : " + e);
		}
	}

}
