package ch07;

public class Cat {
	String breed;
	String color;
	
	//기본 생성자를 선언
	Cat() {
		System.out.println("Cat() 기본 생성자 호출");
	}
	
	//일반 생성자 선언
	Cat(String pBreed) {
		System.out.println("Cat(...) 일반 생성자 호출");
		breed = pBreed; 
	}
	
	//생성자 오버로딩
	Cat(String pBreed, String pColor) {
		System.out.println("Cat(... ...) 일반 생성자 호출");
		breed = pBreed;
		color = pColor;
	}
	
	void eat() {
		System.out.println("먹이를 먹다.");
	}

	void scratch() {
		System.out.println("발톱 갖고 할퀸다");
	}
	
	void meow() {
		System.out.println("야옹 하고 운다");
	}
}