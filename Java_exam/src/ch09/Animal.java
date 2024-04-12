package ch09;

//추상 클래스는 추상메서드와 일반 메서드를 가질 수 있다.
public abstract class Animal {
	public abstract void printSound();
	
	public void displayInfo() {
		System.out.println("난 동물이여");
	}
}
