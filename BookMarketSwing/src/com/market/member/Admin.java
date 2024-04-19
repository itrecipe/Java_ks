package com.market.member;

public class Admin extends Person {
	private String id = "admin";
	private String password = "1234";

	public Admin(String name, int phone) {
		super(name, phone);
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}
}