package com.section03;

import com.javamarster.mypackage.Dog;

public class Package03 {

	public static void main(String[] args) {
		Dog dog01 = new Dog();
		Dog dog02 = new Dog();
		System.out.println(dog01.equals(dog02)); //두 참조 변수의 주소가 다르다.
		
		String str1 = dog01.bowwow();
		String str2 = dog02.bowwow();
		System.out.println(str1.equals(str2)); //두 참조 변수의 문자열이 동일하다.
	}

}
