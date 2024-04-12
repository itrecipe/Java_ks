package ch09;

public class Chicken implements Fly, Walk {
	public void fly() {
		System.out.println("닭은 날 수 있다.");
	}
	
	public void walk() {
		System.out.println("닭은 걸을 수 있다.");
	}
}
