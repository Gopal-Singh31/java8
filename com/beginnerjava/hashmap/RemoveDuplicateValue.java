package com.beginnerjava.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateValue {
	public static void main(String[] args) {

		// Initial Map : {A=1, B=2, C=2, D=3, E=3}
		// After => {A=1, B=2, D=3}

		Map<String, String> map = new HashMap<>();
		map.put("A", "1");
		map.put("B", "2");
		map.put("C", "2");
		map.put("D", "3");
		map.put("E", "3");

		System.out.printf("before :   " + map);
		System.out.println("\n");

//		Set<String> set = new HashSet<>();
//
//		map = map.entrySet().stream().filter(entry -> set.add(entry.getValue()))
//				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//		System.out.printf("after => " + map);

		/*
		 * System.out.println("Initial Map : " + map); 
		 * for (String s : new ConcurrentHashMap<>(map).keySet()) { 
		 * String value = map.get(s);
		 * for(Map.Entry<String, String> ss : new ConcurrentHashMap<>(map) .entrySet())
		 * { if (s != ss.getKey() && value == ss.getValue()) { map.remove(ss.getKey());
		 * } } } System.out.println("Final Map : " + map);
		 */

		
		  Set<String> mySet = new HashSet<String>();
		 
		  for (Iterator itr = map.entrySet().iterator(); itr.hasNext();) {
			  Map.Entry<String, String> entrySet = (Map.Entry) itr.next();
		  
			  	String value = entrySet.getValue();
		
		  if (!mySet.add(value)) { 
			  itr.remove(); } 
		  } 
		  System.out.println("mymap :" +map);
		 

		  
	}
}
