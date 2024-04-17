package ch12;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling03 {

	public static void main(String[] args) {
		File file = new File("member.txt"); //member라는 텍스트 파일을 만들기 위해 File 클래스 객체 생성

		try {
			if(!file.exists()) //해당 파일이 있는지 없는지 검사해서 없으면
				file.createNewFile();//여기서 파일 새로 생성하라고 조건을 준다.
			//FileWriter fw = new FileWriter(file, false); //기존에 작성한 코드
			FileWriter fw = new FileWriter(file, false); //기본값은 false이며, 덮어쓸수 있음, true를 주면 덮어쓰지 않고 새로 작성한다.
			Scanner input = new Scanner(System.in);

			boolean quit = false;
			while(!quit) {
				System.out.print("ID : ");
				String userID = input.next();
				fw.write("ID : " + userID + " ");

				System.out.print("Name : ");
				String userName = input.next();
				fw.write("Name : " + userName + " " + "\n");

				System.out.println("계속 진행? Y | N");
				input = new Scanner(System.in);
				String str = input.nextLine();

				if(str.toUpperCase().equals("N"))
					quit = true;
			}
			fw.close();
			System.out.println("파일 쓰기 성공!");
		}catch(Exception e) {
			e.getMessage();
		}
	}
}