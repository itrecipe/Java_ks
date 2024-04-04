package ch04;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		System.out.println("점수 입력");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		switch (num / 10) {
		case 10:
		case 9:
			System.out.println("A 학점");
			break;
		}
		
	}

}
