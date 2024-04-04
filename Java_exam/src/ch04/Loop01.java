package ch04;

import java.util.Scanner;

public class Loop01 {
	public static void main(String[] args) {
		int sum = 0;
		System.out.println("5개의 숫자를 입력");
		
		for(int n = 1; n <= 5; n++) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			sum += num;
		}
		System.out.println("합계 : " + sum);
	}
}
