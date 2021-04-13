package com.beginnerjava8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElement {
	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 1, 2, 3, 4, 3, 2, 4, 2 };
		List<Integer> listWithDuplicates = Arrays.asList(arr);

		Set<Integer> setWithoutDups = listWithDuplicates.stream()
														.collect(Collectors.toSet());
		setWithoutDups.forEach((i) -> System.out.print(" " + i));
		
		System.out.println("\n ====================================");
		Integer[] arr1=new Integer[]{1,2,3,4,3,2,4,2};
        List<Integer> listWithDuplicates1 = Arrays.asList(arr1);
List<Integer> listWithoutDups1 = listWithDuplicates1.stream()
													.distinct()
													.collect(Collectors.toList());
        listWithoutDups1.forEach((i)->System.out.print(" "+i));
	}
}
