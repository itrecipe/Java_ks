package ch04;

import java.util.Scanner;

public class Loop04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("길이 : ");
		
		//사용자로부터 길이를 정수 형태로 입력 받는다.
		int len = sc.nextInt();
		
		//바깥쪽 for문은 역삼각형의 높이를 결졍한다.
		for(int i = 0; i < len; i++) { //여기서 변수 i는 현재 줄 번호를 의미 한다.
			for(int j = 0; j < i; j++) { //공백을 만들어주는 for문
				System.out.print(" ");
			}
			//해당 코드는 다이아몬드나 피라미드 같은 패턴을 그리는데 자주 사용되는 로직의 일부일 수 있음
			//변수 j는 각 줄에 별(*)을 찍기 위한 반복문 변수
			for(int j = 0; j < (2 * len) - 1 - (i * 2); j++) { //실질적으로 *을 찍는 for문
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