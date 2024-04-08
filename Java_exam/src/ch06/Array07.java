package ch06;

public class Array07 {

	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = s1;
		
		if(s1 == s2) System.out.println("s1과 s2는 같다.");
		else System.out.println("s1과 s2는 같지 않다.");

		if(s1 == s3) System.out.println("s1과 s3는 같다.");
		else System.out.println("s1과 s3는 같지 않다.");
		
		if(s1.equals(s2)) System.out.println("s1과 s2의 값은 같다.");
		else System.out.println("s1과 s2의 값은 같지 않다.");
	}

}
