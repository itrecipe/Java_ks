package com.section03;

import java.util.Random;

public class Example12 {

	public static void main(String[] args) {
		Random random1 = new Random();
		System.out.println("난수 값 : " + random1.nextInt());
		
		Random random2 = new Random();
		for(int i = 0; i < 10; i++) {
			System.out.print(random2.nextInt(100) + " ");
		}
	}
}