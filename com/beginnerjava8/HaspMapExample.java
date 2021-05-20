package com.beginnerjava8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class HaspMapExample {
public static void main(String[] args) {
	
	Map<Integer,Employee> map = new HashMap();
	
	Employee  emp1 = new Employee(1,"Anurud");
	Employee  emp2 = new Employee(2,"Gopal");
	Employee  emp3 = new Employee(3,"Anurud");
	Employee  emp4 = new Employee(4,"Anurud");
	
	map.put(1, emp1);
	map.put(2, emp2);
	map.put(3, emp3);
	map.put(4, emp4);
	
	dupicate(map);
	
	
	
	
}

private static void dupicate(Map<Integer, Employee> map) {
	
	Set set = new HashSet();
	
	set.add(map);
	
	System.out.println();
	
	
	
}
}
