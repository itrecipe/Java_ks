package ch05;

public class Method06 {

	public static void calculate(int x, int y) {
		System.out.println(x * y);
	}
	
	public static void calculate(int x) {
		System.out.println(x * x);
	}
	
	public static void calculate(int x, double y) {
		System.out.println(x * y + "a");
	}
	public static void calculate(double x, double y) {
		System.out.println(x * y);
	}
	
	public static void calculate(double x) {
		System.out.println(x * x);
	}
	
	public static void main(String[] args) {
		calculate(2, 3);
		calculate(2);
		calculate(2, 3.14);
		calculate(2.5);
	}
}