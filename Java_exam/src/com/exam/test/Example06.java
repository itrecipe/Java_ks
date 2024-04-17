package com.exam.test;

class MyException extends Exception {
	String str1;
	
	MyException(String str2) {
		str1 = str2;
	}
	
	public String toString() {
		return ("MyException 발생 : " + str1);
	}
}

public class Example06 {
	public static void main(String[] args) {
		try {
			System.out.println("try 블록!");
			throw new MyException("MyException 클래스 호출됨!"); //사용자 정의 예외 클래스를 호출한다.
		} catch(MyException e) {
			System.out.println("catch 블록이다");
			System.out.println(e);
		}
	}
}
