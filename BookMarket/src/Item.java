//장바구니 항목 클래스 생성
//주요 도서 정보 관리 추상 클래스 생성하기
//추상화란 불필요한 정보를 숨기고 중요한 정보만을 나타내는 것을 의미
public abstract class Item {
	String bookId;
	String name;
	int unitPrice;
	
	public Item(String bookId, String name, int unitPrice) {
		this.bookId = bookId;
		this.name = name;
		this.unitPrice = unitPrice;
	}
	
	abstract String getBookId();
	
	abstract String getName();
	
	abstract int getUnitPrice();
	
	abstract void setBookId(String bookId);
	
	abstract void setName(String name);

	abstract void setUnitPrice(int unitPrice);
}
