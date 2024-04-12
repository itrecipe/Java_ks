package ch09;

public class Interface02 {
	public static void main(String[] args) {
		Chicken myChicken = new Chicken();
		Bird myBird = new Bird();
		
		myChicken.fly();
		myChicken.walk();
		myBird.fly();
	}
}