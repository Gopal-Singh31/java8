package com.beginner.stream;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsGroupingByExample {

	public static void main(String[] args) {
		List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");

		Map<String, Long> result = items.stream()
										.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

//		System.out.println(result);

		Map<String, Long> finalMap = new LinkedHashMap<>();

		// Sort a map and add to finalMap
		result.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
				.forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

//		System.out.println(finalMap);
//		System.out.println(result);

		System.out.println("----------------------------------------------------------");

		List<Item> items1 = Arrays.asList(new Item("apple", 10, new BigDecimal("9.99")),
										  new Item("banana", 20, new BigDecimal("19.99")), 
										  new Item("orang", 10, new BigDecimal("29.99")),
										  new Item("watermelon", 10, new BigDecimal("29.99")), 
										  new Item("papaya", 20, new BigDecimal("9.99")),
										  new Item("apple", 10, new BigDecimal("9.99")), 
										  new Item("banana", 10, new BigDecimal("19.99")),
										  new Item("apple", 20, new BigDecimal("9.99")));
		
//		Map<String, Long> counting = items1.stream()
//											.collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
//
//		System.out.println(counting);
//
//		Map<Integer, Long> counting2 = items1.stream()
//											 .collect(Collectors.groupingBy(Item::getQty, Collectors.counting()));
//
//		System.out.println(counting2);
//		Map<BigDecimal, Long> counting3 = items1.stream()
//												.collect(Collectors.groupingBy(Item::getPrice, Collectors.counting()));
//
//		System.out.println(counting3);
//
//		Map<String, Integer> sum = items1.stream()
//										 .collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));
//
//		System.out.println(sum);
		
		
		System.out.println("====================================================================");
		
		
//		 //group by price
//        Map<BigDecimal, List<Item>> groupByPriceMap =items.stream()
//        													.collect(Collectors.groupingBy(Item::getPrice));
//
//        System.out.println(groupByPriceMap);
//
//        // group by price, uses 'mapping' to convert List<Item> to Set<String>
//        Map<BigDecimal, Set<String>> result1 = items.stream()
//        											.collect(Collectors.groupingBy(Item::getPrice,
//        														Collectors.mapping(Item::getName, Collectors.toSet())
//                        )
//                );
//
//        System.out.println(result1);
	}

	
	
	
}

class Item {

	private String name;
	private int qty;
	private BigDecimal price;

	public Item(String name, int qty, BigDecimal price) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
