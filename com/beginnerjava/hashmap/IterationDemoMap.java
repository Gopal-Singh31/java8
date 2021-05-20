package com.beginnerjava.hashmap;

import java.util.HashMap;
import java.util.Map;

public class IterationDemoMap {
	public static void main(String[] args) {
		Map<String, String> gfg = new HashMap<String, String>();

		gfg.put("GFG", "geeksforgeeks.org");
		gfg.put("Practice", "practice.geeksforgeeks.org");
		gfg.put("Code", "code.geeksforgeeks.org");
		gfg.put("Quiz", "quiz.geeksforgeeks.org");
		
//		for(Map.Entry<String, String> map: gfg.entrySet()) {
//			System.out.println("[" +map.getKey() +","+map.getValue()+"]");
//			
//		}
		
//		gfg.forEach((key,value) -> System.out.println(key+","+value));
		
		for(String key : gfg.keySet()) {
			
			System.out.println(key +","+gfg.get(key));
		}
	}

}
