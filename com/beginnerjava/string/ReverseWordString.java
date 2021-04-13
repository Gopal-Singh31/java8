package com.beginnerjava.string;

public class ReverseWordString {
	public static void main(String[] args) {
		String str = "this is word";

		String reverseString = "";

		String[] splitStr = str.split(" ");
		int length = splitStr.length;
		for (int i = length - 1; i >= 0; i--) {
			reverseString = reverseString + " " + splitStr[i];
		}
		System.out.println(reverseString);
	}

}
