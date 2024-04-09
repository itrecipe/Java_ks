package ch07;

public class Chain {

	//메서드 체이닝 실습(this를 활용한 생성자 체인)
	Chain() {
		this(10);
		System.out.println("기본 생성자 Chain() 호출");
	}
	
	Chain(int x) {
		this(5, 6);
		System.out.println("일반 생성자 Chain(int x) 호출");
		System.out.println("x의 값 : " + x);
	}
	
	Chain(int x, int y) {
		System.out.println("일반 생성자 Chain(int x, int y) 호출");
		System.out.println("x와 y값 : " + x + " " + y);
	}
	
	public static void main(String[] args) {

		Chain obj = new Chain();
	}
}
