package com.beginnerjava.hashmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateArrayList {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("Mango");
		l.add("Banana");
		l.add("Mango");
		l.add("Apple");
		System.out.println(l.toString());
//		Set<String> s = new LinkedHashSet<String>(l);
		Set<String> s = new HashSet<String>(l);
		System.out.println(s.toString());
		
		for(String s1:s) {
			System.out.println(s1);
		}
		
		
	}
}
