package com.beginnerjava.program;

import java.util.ArrayList;

public class GenericExample {
	public static void main(String[] args) {
       ArrayList<Employee> list = new ArrayList<>();
       
       Employee e =new Employee();
        X x = new X();
        
        list.add(e);
        list.add(x);
        
        for(Employee e1 : list) {
        	System.out.println(list.get(1));
        }
	}
}

class Employee{}

class X extends Employee{}