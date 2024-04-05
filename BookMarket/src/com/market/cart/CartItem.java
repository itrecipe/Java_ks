package com.market.cart;

import com.market.bookitem.Book;

//장바구니의 상품 항목을 관리할 수 있는 CartItem 클래스 생성
public class CartItem {
	//private String[] itemBook = new String[7];
	
	private Book itemBook;
	private String bookID;
	private int quantity;
	private int totalPrice;
	
	//기본 생성자 생성
	public CartItem() {
		
	}

	/* 이전에 작성했던 코드
	public CartItem(String[] book) {
		this.itemBook = book;
		this.bookID = book[0];
		this.quantity = 1;
		updateTotalPrice();
	}

	public String[] getItemBook() {
		return itemBook;
	}

	public void setItemBook(String[] itemBook) {
		this.itemBook = itemBook;
	}
	*/

	public CartItem(Book bookList) {
		this.itemBook = bookList;
		this.bookID = bookList.getBookId();
		this.quantity = 1;
		updateTotalPrice();
	}
	
	public Book getItemBook() {
		return itemBook;
	}

	public void setItemBook(Book itemBook) {
		this.itemBook = itemBook;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
		this.updateTotalPrice();
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void updateTotalPrice() {
		//Integer.parseInt 문자열을 숫자로 변경해주는 메서드
		//totalPrice = Integer.parseInt(this.itemBook[2]) * this.quantity;
		totalPrice = this.itemBook.getUnitPrice() * this.quantity;
	}
}