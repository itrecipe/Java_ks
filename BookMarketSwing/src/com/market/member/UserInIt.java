package com.market.member;

public class UserInIt {
	private static User mUser;
	
	public static void setmUser(User mUser) {
		UserInIt.mUser = mUser;
	}
	
	public static void init(String name, int phone) {
		mUser = new User(name, phone); //객체 생성
	}
	
	public static User getmUser() {
		return mUser;
	}
	
	
}
