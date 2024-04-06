package com.exam.test;

class MyDateJAVA {
	int year;
	int month;
	int day;
}

public class Sample {

	public static void main(String[] args) {
		MyDateJAVA m[] = new MyDateJAVA[100];

		for(int i = 0; i < 100; i++) {
			m[i] = new MyDateJAVA();
			m[i].year = 2000;
			m[i].month = 1;
			m[i].day = i;
		}
	}
}