package com.beginnerjava8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class SumNumber {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("================using Reduce () =========================");
		int sum = integers.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum);
		
		int minus = integers.stream().reduce(0, (a,b)-> a-b);
		System.out.println(minus);
		int multiply = integers.stream().reduce(1, (a,b)-> a*b);
		System.out.println(multiply);
		
		System.out.println("=========================================================");
		System.out.println("================using Reduce () =========================");
		Integer sum1 = integers.stream()
						.reduce(0, Integer::max);
		
		System.out.println(sum1);
		
		List<Double> double1 = Arrays.asList(1.1, 2.0, 3.2, 4.2, 5.3);
		Double d =double1.stream().reduce(0.0,Double::max);
		System.out.println(d);
		
		
		
		System.out.println("========================Using Stream.collect()==================================");
		List<Integer> integers2 = Arrays.asList(1, 2, 3, 4, 5);
		Integer sum2 = integers2.stream()
								.collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sum2);
						
		System.out.println("=======================Using IntStream.sum()====================================");	
		
		List<Integer> integers3 = Arrays.asList(1, 2, 3, 4, 5);
		Integer sum3 = integers3.stream()
								.mapToInt(Integer::intValue)
								.sum();
		
		System.out.println(sum3);
		
		List<Integer> integers4 = Arrays.asList(1, 2, 3, 4, 5);
		OptionalInt sum4 = integers3.stream()
								.mapToInt(Integer::intValue)
								.min();
		
		System.out.println(sum4);
		System.out.println("=======================Using Stream#sum With Objects====================================");	
		Item item1 = new Item(1, 10);
		Item item2 = new Item(2, 15);
		Item item3 = new Item(3, 25);
		Item item4 = new Item(4, 40);
		        
		List<Item> items = Arrays.asList(item1, item2, item3, item4);
		
		Integer sum5 = items.stream()
				  .map(x -> x.getPrice())
				  .reduce(0, (a, b) -> a + b);
		
		System.out.println(sum5);
		
		Integer sum6 = items.stream()
				  			.map(x -> x.getPrice())
				  			.collect(Collectors.summingInt(Integer::intValue));
		
		Integer sum7s = items.stream()
				  			.map(x -> x.getPrice())
				  			.reduce(0, Integer::sum);
		
		
		
		
	}

}


class Item {

    private int id;
    private Integer price;

    public Item(int id, Integer price) {
        this.id = id;
        this.price = price;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}

