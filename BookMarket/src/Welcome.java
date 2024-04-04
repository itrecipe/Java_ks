import java.util.Scanner;

public class Welcome {
	//자바의 규칙중 하나 상수는 대문자로 선언해야하고 final이라는 키워드를 붙인다!
	static final int NUM_BOOK = 3;
	static final int NUM_ITEM = 7;
	static CartItem[] mCartItem = new CartItem[NUM_BOOK];
	static int mCartCount = 0;
	static User mUser;
	
	public static void main(String[] args) {
		String[][] mBook = new String[NUM_BOOK][NUM_ITEM]; //도서 정보를 저장할 mBook을 2차원 배열로 생성
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("이름을 입력 하세요 : ");
		String userName = input.next(); //이름을 문자열로 받기
		
		System.out.println("연락처 입력 : ");
		int userMobile = input.nextInt(); //연락처를 정수로 받기
		
		mUser = new User(userName, userMobile);
		
		//인사말을 출력해줄 변수
		String greeting = "Welcome to Shopping Mall";
		String tagline = "Welcome to Book Market!";
		
		//종료 여부를 설정하는 변수
		boolean quit = false;
		
		while (!quit) {
			System.out.println("***********************************************");
			System.out.println("\t" + greeting);
			System.out.println("\t" + tagline);
			System.out.println("***********************************************");
			
			/*
			System.out.println("***********************************************");
			System.out.println(" 1. 고객 정보 확인 \t4. 바구니에 항목 추가");
			System.out.println(" 2. 장바구니 상품 목록 보기 \t5. 장바구니 항목 수량 줄이기");
			System.out.println(" 3. 장바구니 비우기 \t6. 장바구니 항목 삭제");
			System.out.println(" 7. 영수증 표시 \t8. 종료");
			System.out.println("***********************************************");
			*/
			
			//메뉴 목록 출력 메서드 호출
			menuIntroduction();
			
			System.out.println("메뉴 번호를 선택");
			int n = input.nextInt();
			//System.out.println(n + "번을 선택 했다.");
			
//			if(n < 1 || n > 8) {
//				System.out.println("1부터 8까지 숫자를 입력");
//			} 
			
			if(n < 1 || n > 9) {
				System.out.println("1 ~ 9 까지의 숫자 입력");
			} else {
				switch(n) { //switch문을 이용해 메뉴 선택 번호별 정보 출력
				
				case 1: 
					//System.out.println("현재 고객 정보 : ");
					//System.out.println("이름 " + userName + " 연락처 : " + userMobile);
					
					//고객 정보 출력 메서드 호출
					menuGuestInfo(userName, userMobile);
					break;
			
				case 2: 
					//System.out.println("장바구니 상품 목록 보기 ");
					menuCartItemList();
					break;
				
				case 3: 
					//System.out.println("장바구니 비우기 ");
					menuCartClear();
					break;
				
				case 4: 
					//System.out.println("장바구니 항목 추가 ");
					menuCartAddItem(mBook);
					break;
				
				case 5: 
					//System.out.println("5. 장바구니 항목 수량 줄이기 ");
					menuCartRemoveItemCount();
					break;
				
				case 6: 
					//System.out.println("6. 장바구니 항목 삭제 ");
					menuCartRemoveItem();
					break;			
				
				case 7: 
					//System.out.println("7. 영수증 표시 ");
					menuCartBill();
					break;			
				
				case 8: 
					//System.out.println("8. 종료");
					menuExit();
					quit = true;
					break;
				case 9:
					menuAdminLogin();
					break;
				} //end switch
			} //end if ~ else
		} //end while
	} //end main
	
	//선택 가능한 메뉴 목록 출력 메서드
	public static void menuIntroduction() {
		System.out.println("***********************************************");
		System.out.println(" 1. 고객 정보 확인 \t4. 바구니에 항목 추가");
		System.out.println(" 2. 장바구니 상품 목록 보기 \t5. 장바구니 항목 수량 줄이기");
		System.out.println(" 3. 장바구니 비우기 \t6. 장바구니 항목 삭제");
		System.out.println(" 7. 영수증 표시 \t8. 종료");
		System.out.println(" 9. 관리자 로그인");
		System.out.println("***********************************************");
	}
	
	//입력 받은 고객 정보 출력 메서드
	public static void menuGuestInfo(String name, int mobile) {
		
		System.out.println("현재 고객 정보 : ");
		
		System.out.println(" 이름 : " + mUser.getName() + "  연락처 : " + mUser.getPhone());
		
//		System.out.println("이름 : " + name + " 연락처 " + mobile);
//		Person person = new Person(name, mobile);
//		System.out.println(" 이름 : " + person.getName() + " 연락처 : " + person.getPhone());
		
	}
	
	//장바구니 상품 목록 표시
	public static void menuCartItemList() {
		System.out.println("2. 장바구니 상품 목록 보기");
		System.out.println("---------------------------------");
		System.out.println("  도서ID \t|  수량 \t|   합계");
		for(int i = 0; i < mCartCount; i++) {
			System.out.print("  " + mCartItem[i].getBookID() + " \t| ");
			System.out.print("  " + mCartItem[i].getQuantity() + " \t| ");
			System.out.print("  " + mCartItem[i].getTotalPrice());
			System.out.println("  ");
		}
		System.out.println("---------------------------------");
	}
	
	public static void menuCartClear() {
		System.out.println("3. 장바구니 비우기");
	}
	
	public static void menuCartAddItem(String[][] book) {
		//System.out.println("4. 장바구니 항목 추가");
		
		BookList(book); //도서 정보를 저장하는 메서드 호출
		for(int i = 0; i < NUM_BOOK; i++) {
			for (int j = 0; j < NUM_ITEM; j++)
				System.out.println(book[i][j] + "|");
				System.out.println();
		}
		
		boolean quit = false;
		
		//장바구니에 항목을 추가하지 않을 때까지 반복하는 while문
		while(!quit) {
			System.out.print("장바구니에 추가할 도서의 ID를 입력해요");
			
			Scanner input = new Scanner(System.in); //도서의 ID를 입력 받는다.
			String str = input.nextLine();
			
			boolean flag = false;
			int numId = -1;
			
			for(int i = 0; i < NUM_BOOK; i++) {
				if(str.equals(book[i][0])) {
					numId = i;
					flag = true;
					break;
				}
			}
			
			if(flag) {
				System.out.println("장바구니에 추가하겠어요? Y | N ");
				str = input.nextLine(); //장바구니에 도서 추가 여부를 위한 입력값 (Y 또는 N)을 받는다.
				
				if(str.toUpperCase().equals("Y")) {
					System.out.println(book[numId][0] + " 도서가 장바구니에 추가되었습니다!");
					
					//장바구니에 넣기
					if(!isCartInBook(book[numId][0]))
						mCartItem[mCartCount++] = new CartItem(book[numId]);
				}
				quit = true;
			} else
				System.out.println("다시 입력 하세요");
		} //end while
	}
	
	public static void menuCartRemoveItemCount() {
		System.out.println("5. 장바구니 항목 수량 줄이기");
	}
	
	public static void menuCartRemoveItem() {
		System.out.println("6. 장바구니 항목 삭제");
	}
	
	public static void menuCartBill() {
		System.out.println("7. 영수증 표시");
	}
	
	public static void menuExit() {
		System.out.println("8. 종료");
	}
	
	public static void BookList(String[][] book) { //도서 정보를 저장할 메서드
		
		book[0][0] = "ISBN1234";
		book[0][1] = "쉽게 배우는 JSP 웹 프로그래밍";
		book[0][2] = "27000";
		book[0][3] = "송미영";
		book[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍";
		book[0][5] = "IT전문서";
		book[0][6] = "2024/04/03";

		book[1][0] = "ISBN1235";
		book[1][1] = "안드로이드 프로그래밍";
		book[1][2] = "33000";
		book[1][3] = "우재남";
		book[1][4] = "실습 단계별 명쾌한 멘토링";
		book[1][5] = "IT전문서";
		book[1][6] = "2022/01/22";
		
		book[2][0] = "ISBN1236";
		book[2][1] = "스크래치";
		book[2][2] = "22000";
		book[2][3] = "고광일";
		book[2][4] = "컴퓨팅 사고력을 키우는 블록 코딩";
		book[2][5] = "컴퓨터 입문";
		book[2][6] = "2019/06/10";
	}
	
	//장바구니에 도서를 추가하는 메서드
	public static boolean isCartInBook(String bookId) {
		boolean flag = false;
		for(int i = 0; i < mCartCount; i++) {
			if(bookId == mCartItem[i].getBookID()) {
				mCartItem[i].setQuantity(mCartItem[i].getQuantity()+1);
				flag = true;
			}
		}
		return flag;
	}
	
	//관리자 로그인
	public static void menuAdminLogin() {
		System.out.println("관리자 정보를 입력");
		
		Scanner input = new Scanner(System.in);
		System.out.println("아이디 : ");
		String adminId = input.next();
		
		System.out.println("비밀번호 : ");
		String adminPW = input.next();
		
		Admin admin = new Admin(mUser.getName(), mUser.getPhone());
		if(adminId.equals(admin.getId()) && adminPW.equals(admin.getPassword())) {
			System.out.println("이름 : " + admin.getName() + "  연락처 : " + admin.getPhone());
			System.out.println("아이디 : " + admin.getId() + "  비밀번호 : " + admin.getPassword());
		} else
			System.out.println("관리자 정보가 일치하지 않아요");
	}
}