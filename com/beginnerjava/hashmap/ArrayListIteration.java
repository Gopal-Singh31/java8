package com.beginnerjava.hashmap;

import java.util.ArrayList;

public class ArrayListIteration {
	
	public static void main(String[] args) {
		ArrayList<Integer> Numbers = new ArrayList<Integer>();
		  
        Numbers.add(23);
        Numbers.add(32);
        Numbers.add(45);
        Numbers.add(63);
  
        Numbers.forEach((n) -> System.out.println(n));
	}

}
