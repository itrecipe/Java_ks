package ch04;

public class Continue01 {

	public static void main(String[] args) {
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 3; j++) {
				if( i == 3 && j == 2) { //해당문장에 조건을 줬기 때문에 3*2는 출력 되지 않는다!
					continue;
				}
				System.out.println(i + " * " + j);
			}
		}
	}

}
