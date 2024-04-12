package ch09;

class Baby implements Papa, Mama {
	
	public void genderFather() {
		System.out.println("난 아버지 입니다.");
	}
	
	public void genderMother() {
		System.out.println("난 어머니 입니다.");
	}
	
	public void printInfo() {
		System.out.println("난 아기 입니다.");
	}


}
