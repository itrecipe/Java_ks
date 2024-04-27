package com.exam.test;

//직원 클래스
class Employee {
	int yearsOfWork;

	public Employee(int yearsOfWork) {
		this.yearsOfWork = yearsOfWork;
	}

	public int getYearsOfWork() {
		return yearsOfWork;
	}
}

//Manager 클래스
class Manager extends Employee {
	public Manager(int yearsOfWork) {
		super(yearsOfWork);
	}
}

//Engineer 클래스
class Engineer extends Employee {
	public Engineer(int yearsOfWork) {
		super(yearsOfWork);
	}
}

//Sales 클래스
class Sales extends Employee {
	public Sales(int yearsOfWork) {
		super(yearsOfWork);
	}
}


public class Polymorphism {

	public static void main(String[] args) {
		// 각 직원의 근속 연수를 초기화합니다.
		Manager manager = new Manager(5);
		Engineer engineer = new Engineer(3);
		Sales sales = new Sales(7);

		// 각 직원의 근속 연수를 출력합니다.
		System.out.println("Manager 근속 연수: " + manager.getYearsOfWork() + "년");
		System.out.println("Engineer 근속 연수: " + engineer.getYearsOfWork() + "년");
		System.out.println("Sales 근속 연수: " + sales.getYearsOfWork() + "년");

		// 다형성을 이용하여 전 직원의 근속 연수 합을 구합니다.
		Employee[] employees = {manager, engineer, sales};
		int totalYearsOfWork = getTotalYearsOfWork(employees);
		System.out.println("전 직원의 근속 연수 합: " + totalYearsOfWork + "년");
	}

	// 전 직원의 근속 연수 합을 반환하는 메서드
	public static int getTotalYearsOfWork(Employee[] employees) {
		int totalYearsOfWork = 0;
		for (Employee employee : employees) {
			totalYearsOfWork += employee.getYearsOfWork();
		}
		return totalYearsOfWork;
	}
}
