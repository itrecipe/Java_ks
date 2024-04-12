package ch09;

public class Example03 {

	//추상 클래스를 상속받는 추상 클래스
	public static void main(String[] args) {

		Bike myBike = new Bike(); //Bike 객체 생성
		Car myCar = new Car();
		
		myBike.printType();
		myBike.printBrand();
		myBike.printPrice();
		
		System.out.println();
		
		myCar.printType();
		myCar.printBrand();
		myCar.printPrice();
	}

}
