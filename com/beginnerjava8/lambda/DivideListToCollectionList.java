package com.beginnerjava8.lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class DivideListToCollectionList {
	public static void main(String[] args) {
		final List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
		final int chunkSize = 3;
		final AtomicInteger counter = new AtomicInteger();

		final Collection<List<Integer>> result = numbers.stream()
													.collect(Collectors.groupingBy(it -> counter.getAndIncrement() / chunkSize))
													.values();

		System.out.println(result);
	}
}
