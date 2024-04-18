package ch13;

import java.util.HashSet;

public class Collection04 {

	public static void main(String[] args) {
		//원래 HashSet은 순서가 없다.(순서를 보장하지 않는다)
		HashSet<String> str = new HashSet<String>();
		
		str.add("A");
		str.add("B");
		str.add("C");
		System.out.println(str);
		
		System.out.print("HashSet 요소 : ");
		
		//enhanced for문 (향상된 for문)
		for(String elements : str)
			System.out.print(elements + " ");
		
		String[] array = new String[str.size()];
		str.toArray(array);
		
		System.out.println();
		System.out.print("Array 요소 : ");
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}

}
