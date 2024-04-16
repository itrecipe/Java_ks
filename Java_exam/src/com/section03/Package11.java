package com.section03;

import java.util.Random;

public class Package11 {

	public static void main(String[] args) {
		Random obj = new Random();
		
		System.out.println("obj : " + obj.nextInt());
		
		obj.setSeed(50); //특정 시드값을 넣었을때 원하는 값만 추출 가능하다.
		System.out.println("obj.setSeed(50) : " + obj.nextInt());
	}

}
