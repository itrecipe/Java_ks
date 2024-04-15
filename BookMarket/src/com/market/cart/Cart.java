package com.market.cart;

import java.util.ArrayList;

import com.market.bookitem.Book;

public class Cart implements CartInterface {
	//mCartItem은 ArrayList 클래스를 이용해 장바구니에 항목을 담는 객체 변수
	public ArrayList<CartItem> mCartItem = new ArrayList<CartItem>();
	
	//static final int NUM_BOOK = 3;
	//public CartItem[] mCartItem = new CartItem[NUM_BOOK];

	public static int mCartCount = 0; //mCartCount 장바구니에 담긴 항목의 총 개수를 저장하는 변수

	//Cart 클래스 기본 생성자
	public Cart() {

	}

	//public void printBookList(Book[] booklist) { //컬렉션 이전에 작성했던 코드
	//도서 정보 목록을 출력하는 메서드
	public void printBookList(ArrayList<Book> booklist) { //컬렉션을 사용하고 있는 코드
		
		//컬렉션 이전 코드
		/*
		for(int i = 0; i < booklist.length; i++) {
			System.out.println(booklist[i].getBookId() + " | ");
			System.out.println(booklist[i].getName() + " | ");
			System.out.println(booklist[i].getUnitPrice() + " | ");
			System.out.println(booklist[i].getAuthor() + " | ");
			System.out.println(booklist[i].getDescription() + " | ");
			System.out.println(booklist[i].getCategory() + " | ");
			System.out.println(booklist[i].getReleaseDate() + " | ");
			System.out.println("");
		}
		*/
		
		//내가 갖고 있는 리스트 만큼 뿌려주는 반복문
		for(int i = 0; i < booklist.size(); i++) {
			Book bookitem = booklist.get(i);
			System.out.print(bookitem.getBookId() + "|");
			System.out.print(bookitem.getName() + "|");
			System.out.print(bookitem.getUnitPrice() + "|");
			System.out.print(bookitem.getAuthor() + "|");
			System.out.print(bookitem.getDescription() + "|");
			System.out.print(bookitem.getCategory() + "|");
			System.out.print(bookitem.getReleaseDate() + "|");
			System.out.println();
		}
	}

	//장바구니에 도서를 삽입하는 insertBook() 메서드
	public void insertBook(Book book) {
		//mCartItem[mCartCount++] = new CartItem(book); //컬렉션 이전 코드
		CartItem bookitem = new CartItem(book);
		mCartItem.add(bookitem);
		mCartCount = mCartItem.size();
		
		
	}

	//장바구니에 담긴 항목을 모두 삭제하는 deleteBook() 메서드
	public void deleteBook() {
		//mCartItem = new CartItem[NUM_BOOK]; //컬렉션 이전 코드
		mCartItem.clear();
		mCartCount = 0;
	}

	//장바구니에 담긴 항목을 출력하는 printCart() 메서드
	public void printCart() {
		System.out.println("장바구니 상품 목록");
		System.out.println("---------------------------------------");
		System.out.println("   도서ID \t|  수량 \t|   합계");
		
		/* 컬렉션 이전 코드
		for(int i = 0; i < mCartCount; i++) {
			System.out.print("  " + mCartItem[i].getBookID() + " \t| ");
			System.out.print("  " + mCartItem[i].getQuantity() + " \t| ");
			System.out.print("  " + mCartItem[i].getTotalPrice());
			System.out.println();
		}
		*/
		
		//컬렉션 파트 코드
		for(int i = 0; i < mCartItem.size(); i++) {
			System.out.print("  " + mCartItem.get(i).getBookID() + " \t| ");
			System.out.print("  " + mCartItem.get(i).getQuantity() + " \t| ");
			System.out.print("  " + mCartItem.get(i).getTotalPrice());
			System.out.println();
		}
		
		System.out.println("---------------------------------------");
	}

	//장바구니에 담길 도서가 장바구니에 존재하는지 확인하는 isCartIntBook() 메서드
	public boolean isCartInBook(String bookId) {
		boolean flag = false;
		
		/* 컬렉션 이전 코드
		for(int i = 0; i < mCartCount; i++) {
			if(bookId == mCartItem[i].getBookID()) {
				mCartItem[i].setQuantity(mCartItem[i].getQuantity() + 1);
				flag = true;
			}
		}
		*/
		
		// 컬렉션 파트 코드
		for(int i = 0; i < mCartItem.size(); i++) {
			if(bookId.equals(mCartItem.get(i).getBookID())) {
				mCartItem.get(i).setQuantity(mCartItem.get(i).getQuantity() + 1);
				flag = true;
			}
		}
		return flag;
	}

	//장바구니의 특정 항목을 삭제하는 removeCart() 메서드
	public void removeCart(int numId) {
		/* 컬렉션 이전 코드
		CartItem[] cartItem = new CartItem[NUM_BOOK];
		int num = 0;

		for(int i = 0; i < mCartCount; i++) {
			if(numId != i )
				cartItem[num++] = mCartItem[i];
			mCartCount = num;
			mCartItem = cartItem;
		}
		*/
		
		//컬렉션 파트에서 수정한 코드
		mCartItem.remove(numId);
		mCartCount = mCartItem.size();
	}
}