package com.exam.test;

import java.util.Random;

public class Test1 {

	public static void main(String[] args) {
		
		int[] comp = new int[4];
		Random rand = new Random();
		
		for(int i = 0; i < 4; i++) {
			comp[i]=rand.nextInt(10);
			for(int j = 0; j < i; j ++) {
				if(comp[i] == comp[j]) {
					i--;
					break;
				}
			}
		}
		
	}
}


//		for(int i = 0; i < 0; i++) {
//			System.out.println("Test Point");
//		}
//		System.out.println("End of Program");
//	}
		
		
