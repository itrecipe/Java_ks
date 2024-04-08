package ch07;

//Student 클래스 생성 (학생이라는 설계도를 만든다.)
public class Student {
	//학생의 속성값은 id와 name이 있다
	int id; 
	String name;
	
	//기본 생성자
	Student() {
		System.out.println("기본 생성자 Student() 호출");
	}
	
	//일반 생성자
	Student(int param1, String param2) {
		System.out.println("일반 생성자 Student(...) 호출");
		id = param1;
		name = param2;
	}
	
	void insertRecord(int parm1, String parm2) {
		id = parm1;
		name = parm2;
	}
	
	void printInfo() {
		System.out.println("ID : " + id);
		System.out.println("NAME : " + name);
	}
}