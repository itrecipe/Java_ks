package ch12;

import java.io.File;
import java.io.FileInputStream;

public class FileHandling04 {

	public static void main(String[] args) {
		File file = new File("member.txt");
		
		//File 클래스로 파일 열기(생성)
		try {
			if(!file.exists())
				file.createNewFile();
			
			//입력 스트림 클래스로 파일 읽기
			//이미지나 영상 같은 것을 뽑을 경우 FileInputStream을 사용해야 한다.
			FileInputStream fis = new FileInputStream(file);
			int i = 0;
			
			while((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
			fis.close(); //파일 읽기 종료하기(닫기)
			System.out.println("\n파일 읽기 성공!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
