package com.beginnerjava8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StreamApiExample {
	
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk"); 
		long count = strList.stream() 
				.filter(x -> x.isEmpty()) 
				.count();
		
		System.out.println(count);
		
		
		 List <Integer> listOfMarks = Arrays.asList(20, 50, 99, 12, 94);

	        OptionalDouble averageOfMarks = listOfMarks
	            .stream()
	            .filter(x -> x<50)
	            .mapToInt(number -> number.intValue())
	            .average();

	        System.out.println("Average of Marks: " + averageOfMarks);
	        
	        List <Integer> listOfMarks1 = Arrays.asList(20, 50, 99, 12, 94);

	        List<Integer> averageOfMarks1 = listOfMarks1
	            .stream()
	            .map(x -> x*x)
	            .filter(x -> x>2500)
	            .collect(Collectors.toList());
	            
	        System.out.println("Average of Marks1: " + averageOfMarks1);
	}
	

}
