import java.util.Scanner; //프로젝트 3-1 Scanner 클래스 패키지 임포트

public class Welcome1 {

	public static void main(String[] args) {

		//프로젝트 3.메인 메뉴 선택하기 (p.108~111)
		//프로젝트 3-2 Scanner 클래스 객체 생성
		Scanner input = new Scanner(System.in);

		//프로젝트 3-3 Scanner 메서드를 이용하여 이름과 연락처를 입력받기
		System.out.print("이름을 입력 하세요 : ");
		String userName = input.next(); //이름을 문자열로 입력받기

		System.out.print("연락처를 입력 하세요 : ");
		int userMobile = input.nextInt(); //연락처를 정수로 입력받기

		/* 프로젝트 1-1 에서 작성했던 내용
		System.out.println("Welcome to Shooping Mall");
		System.out.println("Welcome to Book Market");
		 */

		//프로젝트 2.메인 메뉴 만들기 (p.80~81)
		//프로젝트 2-1.변수를 이용해 인사말을 출력하기
		String greeting = "Welcome to Shooping Mall";
		String tagline = "Welcome to Book Market";

		System.out.println("**********************************************");
		System.out.println("\t" + greeting);
		System.out.println("\t" + tagline);
		System.out.println("**********************************************");

		//프로젝트 2-2 메인 메뉴 항목 만들기
		System.out.println(" 1. 고객 정보 확인 \t4. 바구니에 항목 추가");
		System.out.println(" 2. 장바구니 상품 목록 보기 \t5. 장바구니 항목 수량 줄이기");
		System.out.println(" 3. 장바구니 비우기 \t6. 장바구니 항목 삭제");
		System.out.println(" 7. 영수증 표시 \t8. 종료");
		System.out.println("**********************************************");
		//프로젝트 3-4 메뉴 번호 입력받기 
		//프로젝트 3-4-1 메뉴 번호 입력받아 출력하기
		System.out.print("메뉴 번호를 선택하세요");
		int n = input.nextInt(); //메뉴 번호 입력
		//프로젝트 3-4에서 작성했던 내용 : System.out.println(n + "번을 선택 했어요"); //입력한 번호 출력

		//프로젝트 4.메뉴 정보 표시 및 종료하기 (p.153 ~ 156)
		//프로젝트 4-1 메뉴 정보 출력하기

		//메뉴 선택 번호가 1~8이 아니면 "1부터 8까지의 숫자를 입력하세요" 라는 문자열 출력
		if(n < 1 || n > 8) {
			System.out.println("1부터 8까지의 숫자를 입력!");
		}
		else {
			switch(n) {
			
			case 1 :
				System.out.println("현재 고객 정보 : ");
				break;
			
			case 2 :
				System.out.println("장바구니 상품 목록 조회 : ");
				break;
			
			case 3 :
				System.out.println("장바구니 비우기 : ");
				break;
			
			case 4 :
				System.out.println("현재 고객 정보 : ");
				break;
			
			case 5 :
				System.out.println("현재 고객 정보 : ");
				break;
			
			case 6 :
				System.out.println("현재 고객 정보 : ");
				break;
			
			case 7 :
				System.out.println("현재 고객 정보 : ");
				break;
			
			case 8 :
				System.out.println("현재 고객 정보 : ");
				break;
				
			} //end switch
		} //end else
	}
}
