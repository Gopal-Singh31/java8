package com.beginnerjava.string;

public class ReverseSentence {
	public static void main(String[] args) {
		String str = "this is word";

		String reverseString = "";

		int length = str.length();
		for (int i = length - 1; i >= 0; i--) {
			reverseString = reverseString + str.charAt(i) ;
		}
		System.out.println(reverseString);
	}

}
