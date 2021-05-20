package com.beginner.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparingUsingJava8 {
	public static void main(String[] args) {
		List<Book> listOfBooks = new ArrayList<>(); 
		listOfBooks.add(new Book("Effective Java", "Joshua Bloch", 32)); 
		listOfBooks.add(new Book("Java Puzzlers", "Joshua Bloch", 22)); 
		listOfBooks.add(new Book("Java Concurrency in Practice", "Brian Goetz", 42)); 
		listOfBooks.add(new Book("Java SE 8 for Really Impatient", "Cay S. Horstmann", 34)); 
		listOfBooks.add(new Book("Core Java", "Cay S. Horstmann",32));
		
//		Comparator<Book> byAuthor = (b1, b2) -> b1.getAuthor().compareTo(b2.getAuthor());
//		listOfBooks.sort(byAuthor);
//		System.out.println(listOfBooks);

		
		Comparator<Book> byTitle = Comparator.comparing(Book::getTitle);
		Comparator<Book> byPrice = Comparator.comparing(Book::getPrice);
		
		Comparator<Book> byAuthorThenByPrice = Comparator.comparing(Book::getAuthor)
														.thenComparing(Book::getPrice);
		
		listOfBooks.sort(byAuthorThenByPrice);
		System.out.println(listOfBooks);

	}

}
class Book{
	
	private String title; 
	private String author; 
	private int price;
	
	public Book(String title, String author, int price) { 
		this.title = title; 
		this.author = author; 
		this.price = price; 
		}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}  
	
	@Override
	public String toString() { 
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]\n"; }


}