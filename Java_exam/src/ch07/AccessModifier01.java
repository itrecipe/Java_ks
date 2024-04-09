package ch07;

public class AccessModifier01 {

	public static void main(String[] args) {
		Dog dogObj = new Dog();
		
		dogObj.breed = "포메라니언";
		dogObj.color = "흰색";
		
		System.out.println("강아지 품종 : " + dogObj.breed);
		System.out.println("강아지 색상 : " + dogObj.color);
		dogObj.bowwow();
		
		System.out.println();

		dogObj.age = 10;
		System.out.println("강아지 나이 : " + dogObj.age);
		dogObj.run();
		
		dogObj.name = "다운";
		System.out.println("강아지 이름 : " + dogObj.name);
		dogObj.sleep();
	}
}