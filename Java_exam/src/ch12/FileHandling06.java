package ch12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileHandling06 {

	public static void main(String[] args) {

		File file = new File("member.txt");
		
		try {
			if(!file.exists())
				file.createNewFile();
			
			FileReader fis = new FileReader(file);
			BufferedReader br = new BufferedReader(fis);
			
			String str;
			
			while((str = br.readLine()) != null) {
				System.out.println(str); //한줄 한줄 출력해줌
			}
			fis.close();
			System.out.println("파일 읽기 성공!");
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}