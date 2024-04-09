package ch07;

public class Add {
	
	//하나라도 매개변수가 들어가는 직접 만든 생성자가 있다면 기본 생성자를 만들어줘야 한다!
	Add() {
		System.out.println("기본 생성자 Add() 호출");
	}
	
	Add(int a, int b) {
		System.out.println("일반 생성자 Add(int a, int b) 호출");
		System.out.println(a + " + " + b + " = " + (a + b));
	}
	
	Add(double a, double b) {
		System.out.println("일반 생성자 Add(double a, double b) 호출");
		System.out.println(a + " + " + b + " = " + (a + b));
	}
	
	Add(int a, double b) {
		System.out.println("일반 생성자 Add(int a, double b) 호출");
		System.out.println(a + " + " + b + " = " + (a + b));
	}
}