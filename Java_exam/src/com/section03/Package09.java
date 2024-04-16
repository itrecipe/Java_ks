package com.section03;

import java.util.Calendar;

public class Package09 {

	public static void main(String[] args) {
		/* 캘린더 클래스는 추상클래스여서 new 키워드로 생성이 불가능하다.
		   그래서 getInstance() 메서드로 객체 생성을 해줘야 한다.
		*/
		Calendar obj1 = Calendar.getInstance(); 
		Calendar obj2 = Calendar.getInstance();
		
		obj2.add(Calendar.YEAR, 10);
		
		System.out.println("obj1 : " + obj1.getTime());
		System.out.println("obj2 : " + obj2.getTime());
		
		int comp = obj1.compareTo(obj2);
		
		System.out.println("obj1.compareTO(obj2) : " + comp);
	}
}