package ch08;

public class SubKitten2 extends SuperCat2 {
	String name;
	String age = "2살";
	
	public SubKitten2(String n1, String n2) {
		super(n1);
		this.name = n2;
		System.out.println("아기 고양이" + " 이름은? " + name);
	}
}