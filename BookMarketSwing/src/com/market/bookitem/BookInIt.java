package com.market.bookitem;

import java.io.*;
import java.util.ArrayList;

public class BookInIt {
	private static ArrayList<Book> mBookList;
	private static int mTotalBook = 0;

	public static void init() {
		mTotalBook = totalFileToBookList();
		mBookList = new ArrayList<Book>();
	}

	// 도서 정보 목록을 파일에서 읽어와 출력하기
	// 도서의 개수 얻기
	public static int totalFileToBookList() {

		try {
			//book.txt 파일을 읽기 위한 FileReder 객체 생성
			FileReader fr = new FileReader("book.txt");
			BufferedReader reader = new BufferedReader(fr);
			//파일에서 한 행씩 읽기 위한 BufferedReader 객체 생성

			String str;

			//도서의 개수를 저장하기 위해 선언된 지역변수
			int num = 0;
			while((str = reader.readLine()) != null) {
				if(str.contains("ISBN")) 
					++num;
				/* 파일에서 읽은 한행에 문자열 "ISBN"이
				   포함되어 있다면, 도서의 개수 num을 1 증가 시킨다.
				 */
			}

			reader.close(); //BufferedReader 객체를 종료한다.
			fr.close(); //FileReader 객체를 종료한다.

			return num;
		} catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	//도서 정보 목록을 읽고 저장하기
	//public static void setFileToBookList(Book[] booklist) { //컬렉션 파트 이전에 작성한 코드
	public static void setFileToBookList(ArrayList<Book> booklist) {
		try {
			FileReader fr = new FileReader("book.txt");
			BufferedReader reader = new BufferedReader(fr);

			String str2;
			String[] readBook = new String[7];
			//int count = 0; //컬렉션 파트 이전에 작성한 코드

			while ((str2 = reader.readLine()) != null) {
				if(str2.contains("ISBN")) {
					readBook[0] = str2;
					readBook[1] = reader.readLine();
					readBook[2] = reader.readLine();
					readBook[3] = reader.readLine();
					readBook[4] = reader.readLine();
					readBook[5] = reader.readLine();
					readBook[6] = reader.readLine();
				}

				/* 컬렉션 파트 이전에 작성된 코드
					booklist[count++] = new Book(readBook[0], readBook[1], 
							Integer.parseInt(readBook[2]), readBook[3],
							readBook[4], readBook[5], readBook[6]);
				 */
				Book bookitem = new Book(readBook[0], readBook[1], Integer.parseInt
						(readBook[2]), readBook[3], readBook[4], readBook[5], readBook[6]);

				booklist.add(bookitem);

			} //end while
			reader.close();
			fr.close();

		} //end try 
		catch(Exception e) {
			System.out.println(e);
		} //end catch
	}

	public static ArrayList<Book> getmBookList() {
		return mBookList;
	}

	public static void setmBookList(ArrayList<Book> mBookList) {
		BookInIt.mBookList = mBookList;
	}

	public static int getmTotalBook() {
		return mTotalBook;
	}

	public static void setmTotalBook(int mTotalBook) {
		BookInIt.mTotalBook = mTotalBook;
	}

} // end Class
