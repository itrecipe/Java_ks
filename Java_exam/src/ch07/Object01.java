package ch07;

public class Object01 {

	public static void main(String[] args) {
		
		Student stObj1 = new Student(); //객체 생성
		stObj1.id = 22021004;
		stObj1.name = "홍길동";
		stObj1.printInfo();
		
		System.out.println();
		
		Student stObj2 = new Student();
		stObj2.insertRecord(20021005, "홍길동");
		stObj2.printInfo();
	}

}
