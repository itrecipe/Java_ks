package com.section03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Package12 {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat dateF = new SimpleDateFormat("dd/MM/yyyy");
		String fulldate = dateF.format(date);
		System.out.println("현재 날짜 : " + fulldate);

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd");
		String day = dateFormat.format(date);
		System.out.println("일 : " + day);
		
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("MM");
		String month = dateFormat2.format(date);
		System.out.println("월 : " + month);
		
		SimpleDateFormat dateFormat3 = new SimpleDateFormat("yyyy");
		String year = dateFormat3.format(date);
		System.out.println("년 : " + year);
	}
}
