package com.beginnerjava.hashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TraveserMap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("A", "1");
		map.put("B", "2");
		map.put("C", "2");
		map.put("D", "3");
		map.put("E", "3");

//		Set<String> set = new HashSet();
//		for (Map.Entry<String,String> mapElement : map.entrySet()) {
//			String key =  mapElement.getKey();
//			String value = mapElement.getValue();
//			
//			System.out.println(key + " : " + value);
//		}
//		
//		System.out.println(map);

		Map<String, Object> mapValues = new HashMap<String, Object>(5);
		mapValues.put("1", "TJ");
		mapValues.put("2", "Arun");
		mapValues.put("3", "TJ");
		mapValues.put("4", "Venkat");
		mapValues.put("5", "Arun");

		Collection<Object> list = mapValues.values();
		for (Iterator<Object> itr = list.iterator(); itr.hasNext();) {
			if (Collections.frequency(list, itr.next()) > 1) {
				itr.remove();
			}
		}
		
		System.out.println(mapValues);
	}

}
