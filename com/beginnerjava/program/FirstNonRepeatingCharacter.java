package com.beginnerjava.program;

public class FirstNonRepeatingCharacter {
	 static final int NO_OF_CHARS = 256;
	 static char count[] = new char[NO_OF_CHARS];
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		
		 int index = firstNonRepeating(str);
		 System.out.println(str.charAt(index));
	}

	private static int firstNonRepeating(String str) {
		
		 getCharCountArray(str);
		 int index = -1, i;
		 
	        for (i = 0; i < str.length(); i++) {
	            if (count[str.charAt(i)] == 1) {
	                index = i;
	                break;
	            }
	        }
	 
	        return index;
		
	}

	private static void getCharCountArray(String str) {
		for (int i = 0; i < str.length(); i++)
            System.out.println(count[str.charAt(i)]++);
		
		
	}

}
