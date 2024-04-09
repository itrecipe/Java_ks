package ch08;

public class Calculation {

	int z;
	
	public void addition(int x, int y) {
		z = x + y;
		System.out.println("두 수의 덧셈 : " + z);
	}
	
	public void subtraction(int x, int y) {
		z = x - y;
		System.out.println("두 수의 뺄셈 : " + z);
	}

}
