package ch13;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Collection7 {
	public static void main(String[] args) {
		TreeMap<Integer, String> str = new TreeMap<>(); //뒤에는 굳이 (키, 값) 쌍의 타입을 안넣어도 잘된다.

		//순서가 고정되지 않음
		str.put(1, "A");
		str.put(2, "B");
		str.put(3, "C");

		System.out.println(str);

		//enhanced for문 (향상된 for문)
		System.out.print("Keys : ");
		for(Integer key : str.keySet()) { //keySet() 키 값만 뽑아주는애
			System.out.print(key);
			System.out.print(", ");
		}

		//enhanced for문 (향상된 for문)
		System.out.print("Values : ");
		for(String value : str.values()) {
			System.out.print(value);
			System.out.print(", ");
		}

		System.out.println();
		System.out.println("keys=Values : ");
		for(Entry<Integer, String> entry : str.entrySet()) {
			System.out.print(entry);
			System.out.print(", ");
		}
	}
}