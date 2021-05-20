package com.beginnerjava.string;

/*Given a string(word), S, print the number of distinct words with or without meaning that can be formed with the letters of the given word.

Note: Each word should start with a consonant.*/


import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CandidateCode {
	 static Set<String> permutations;
	    static Set<String> result = new HashSet<String>();

	    public static Set<String> permutation(String string) {
	        permutations = new HashSet<String>();

	        int n = string.length();
	        for (int i = n - 1; i >= 0; i--) 
	        {
	            shuffle(string.charAt(i));
	        }
	        return permutations;
	    }

	    private static void shuffle(char c) {
	        if (permutations.size() == 0) {
	            permutations.add(String.valueOf(c));
	        } else {
	            Iterator<String> it = permutations.iterator();
	            for (int i = 0; i < permutations.size(); i++) {

	                String temp1;
	                for (; it.hasNext();) {
	                    temp1 = it.next();
	                    for (int k = 0; k < temp1.length() + 1; k += 1) {
	                        StringBuilder sb = new StringBuilder(temp1);

	                        sb.insert(k, c);

	                        result.add(sb.toString());
	                    }
	                }
	            }
	            permutations = result;
	            result = new HashSet<String>();

	        }
	    }

	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        String  s = scanner.nextLine();
	        Set<String> result = permutation(s);

	        
	        String arr[] = new String[result.size()];
	        int i = 0;
	        for (String x : result)
	            arr[i++] = x;
	  
	        for (int ii =0; ii<arr.length;ii++) {
	        	System.out.println("Hello :"+arr[ii].charAt(0));
		           char ch = arr[ii].charAt(0);
		                       
		            if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
		                      ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
		                        ch=='u' || ch=='U'){
		                        result.remove(arr[ii]);
		            }
	           }
	        
	        System.out.println(result.size());
	    }
}
