package ch08;

public class SubKitten extends SuperCat {
	String age = "2살";
	
	void printInfo() {
		System.out.println("아기 고양이다.");
	}
	
	void printDetail() {
		super.printInfo();
		System.out.println("품종은? " + super.breed + ", 나이는? " + super.age);
		
		printInfo();
		System.out.println("품종은? " + breed + ", 나이는? " + age);
		//System.out.println("품종은? " + this.breed + ", 나이는? " + this.age);
	}
}
