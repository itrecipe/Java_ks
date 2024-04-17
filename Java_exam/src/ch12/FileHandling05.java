package ch12;

import java.io.File;
import java.io.FileReader;

public class FileHandling05 {

	public static void main(String[] args) {
		File file = new File("member.txt");
		
		try {
			if(!file.exists())
				file.createNewFile();
			
			FileReader fis = new FileReader(file); //String(문자열)은 FileReader객체로 뽑는게 좋고, 이미지나 영상 같은 경우 FileInputStream을 사용해야 한다.
			int i = 0;
			
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
			fis.close();
			System.out.println("파일 읽기 성공");
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
