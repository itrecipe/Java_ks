package com.market.member;

//관리자 정보 관리
public class Admin extends Person {
	private String id = "admin";
	private String password = "1234";
	
	public Admin(String name, int phone) {
		super(name, phone); //super 키워드를 사용했다. 이것의 의미는 부모(Person)가 가진 name과 phone 값을 받는다 라는 의미이다.
	}
	
	/* Admin 페이지에서는 값을 바꾸거나 내보낼것이
	   없으므로 setter을 제외한 getter만 만들어준다. 
	*/
	public String getId() {
		return id;
	}
	
	public String getPassword() {
		return password;
	}
}
