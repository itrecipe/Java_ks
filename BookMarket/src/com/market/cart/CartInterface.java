package com.market.cart;

import java.util.ArrayList;

import com.market.bookitem.Book;

//장바구니 처리 인테페이스 생성
public interface CartInterface {
	//전체 도서 정보 목록 출력
	//void printBookList(Book[] p); //컬렉션을 사용하기 이전 코드
	void printBookList(ArrayList<Book> p);
	boolean isCartInBook(String id);
	void insertBook(Book p);
	void removeCart(int numId);
	void deleteBook();
}
