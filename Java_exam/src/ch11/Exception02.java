package ch11;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력");
		int num = s.nextInt();
		
		int arr[] = new int[5];
		
		//try 블록 시작 - 예외가 발생할 수 있는 코드를 포함
		try {
			arr[num] = 10 / num; //사용자가 입력한 값으로 배열의 특정 위치에 있는 값을 할당하려는 시도를 한다.
			System.out.println(arr[num]);
		}
		catch(ArithmeticException e) {
			System.out.println("0이 아닌 값을 입력");
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("올바른 배열 인덱스를 입력");
			System.out.println(e.getMessage());
		}
	}
}