package com.beginnerjava8.lambda;

import java.util.ArrayList;
import java.util.List;

public class StreamFilterEx {

	public static void main(String a[]) {

		List<Employee2> empList = new ArrayList<>();
		empList.add(new Employee2("Nataraja G", "Accounts", 8000));
		empList.add(new Employee2("Nagesh Y", "Admin", 15000));
		empList.add(new Employee2("Vasu V", "Security", 2500));
		empList.add(new Employee2("Amar", "Entertinment", 12500));

		// find employees whose salaries are above 10000
		empList.stream()
		.filter(emp -> emp.getSalary() > 10000)
		.forEach(System.out::println);
	}

}

class Employee2 {

	private String name;
	private String account;
	private Integer salary;

	public Employee2(String name, String account, Integer salary) {
		super();
		this.name = name;
		this.account = account;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {

		return "name: " + this.name + " | account: " + this.account + " | salary: " + this.salary;
	}

}