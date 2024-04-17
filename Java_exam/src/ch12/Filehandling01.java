package ch12;

import java.io.File;

public class Filehandling01 {

	public static void main(String[] args) {
		
		//파일 객체 생성 및 추상적인 경로 작성
		File fInfo =  new File("src\\ch12\\Example01.java");
		
		if(fInfo.exists()) { //.exists() 요청한 파일이 해당 디렉토리에 있는지 확인 해준다.
			System.out.println("파일명 : " + fInfo.getName());
			System.out.println("파일 경로 : " + fInfo.getAbsolutePath());
			System.out.println("파일 쓰기 가능? : " + fInfo.canWrite());
			System.out.println("파일 읽기 가능? : " + fInfo.canRead());
			System.out.println("파일 크기 : " + fInfo.length());
		} else {
			System.out.println("존재하지 않는 파일!");
		}
	}
}