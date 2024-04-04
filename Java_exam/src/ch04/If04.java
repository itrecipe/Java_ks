package ch04;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		System.out.println("3개 숫자 입력");
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x > y) {
			if(x > z) {
				System.out.println(x + "는 가장 큰 정수!");
			} 
			
			else {
				System.out.println(x + "는 가장 큰 정수");
			} 
		}
			else {
				
				System.out.println(x + "는 가장 작은 정수");
			}
		}
	}