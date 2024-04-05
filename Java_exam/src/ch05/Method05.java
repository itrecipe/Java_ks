package ch05;

public class Method05 {

	//원의 둘레를 계산하는 메소드
	public static void calculate(int x, double y) {
		System.out.println(2 * x * y);
	}
	
	public static void main(String[] args) {
		int a = 4; //반지름
		double pi = 3.14;
		System.out.println(" 원의 둘레 구하는 공식 : 2 * 반지름 * 원주율 ");
		
		System.out.println(" 2 x " + a + " x " + pi + " = ");
		calculate(a, pi);
	}
}