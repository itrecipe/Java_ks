package com.market.cart;

import com.market.bookitem.Book;

//장바구니 처리 인테페이스 생성
public interface CartInterface {
	void printBookList(Book[] p); //전체 도서 정보 목록 출력
	boolean isCartInBook(String id);
	void insertBook(Book p);
	void removeCart(int numId);
	void deleteBook();
}
