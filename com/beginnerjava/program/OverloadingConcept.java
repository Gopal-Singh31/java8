package com.beginnerjava.program;

public class OverloadingConcept {
	
	public static void main(String[] args) {
		
		Employee1 emp = new Employee1();
		emp.display(2);
		
		//emp.display(null);// comilation error because of integer overloading method
	
	}

}

class Employee1{
	
	void display(String s) {
		System.out.println("String :"+s);
	}
	
	void display(Object o) {
		System.out.println("Object  :"+o);
	}
	
	void display(Integer o) {
		System.out.println("Integer  :"+o);
	}
}


