package ch08;

public class Inheritance01 extends Calculation {

	/* 자바에서 상속은 1개밖에 허용되지 않는다.
	 * 다만, 부모가 여러자식을 거느릴순 있으나
	 * 자식이 여러 부모를 거느릴순 없느니라
	 * 이것이 상속의 개념이니라
	*/
	
	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("두 수의 곱셈 : " + z);
	}
	
	public static void main(String[] args) {
		int a = 20, b = 10;
		Inheritance01 obj = new Inheritance01(); //객체 생성
		obj.addition(a, b);
		obj.subtraction(a, b);
		obj.multiplication(a, b);
	}
}
