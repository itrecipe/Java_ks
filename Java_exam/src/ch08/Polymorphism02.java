package ch08;

public class Polymorphism02 {
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Animal myPig = new Pig(); //부모 객체의 타입을 선언했음에도 불구하고 자식객체를 선언해도 무방함
		Animal myDog = new Dog();
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
	}
}