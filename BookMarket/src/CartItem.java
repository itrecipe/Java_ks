//장바구니의 상품 항목을 관리할 수 있는 CartItem 클래스 생성
public class CartItem {
	private String[] itemBook = new String[7];
	private String bookID;
	private int quantity;
	private int totalPrice;
	
	//기본 생성자 생성
	public CartItem() {
		
	}
	
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
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void updateTotalPrice() {
		//Integer.parseInt 문자열을 숫자로 변경해주는 메서드
		totalPrice = Integer.parseInt(this.itemBook[2]) * this.quantity;
	}
}