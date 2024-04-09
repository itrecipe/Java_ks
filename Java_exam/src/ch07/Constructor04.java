package ch07;

public class Constructor04 {

	public static void main(String[] args) {
		MemberChain object = new MemberChain();
		object.printInfo();
		
		System.out.println();
		
		MemberChain object1 = new MemberChain("홍길동", 15, "북한");
		object1.printInfo();
		
		System.out.println();
		
		MemberChain object2 = new MemberChain("둘리", 10, "알수없음! 불법체류");
		object2.printInfo();
		
		
	}
}
