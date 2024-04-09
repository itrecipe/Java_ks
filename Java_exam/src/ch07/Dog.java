package ch07;

public class Dog {
	String breed; //품종
	String color;
	int age;
	String name;

	//개소리 메서드
	void bowwow() {
		System.out.println("멍멍!");
	}

	void run() {
		System.out.println("달리다");
	}

	void sleep() {
		System.out.println("잔다.");
	}
}
