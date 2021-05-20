package com.beginnerjava8;

public class CharacterSquare {

	
	 static void print_rectangle(int k, int l){
	        int a, b;
	        String S ="abcd";
	        for (a =1; a <=S.length(); a++) {
	           
	            for (b = 1; b <= l; b++) {
	                if (a == 1 || a == k || b == 1 || b == l) {
	                		 System.out.print(S.charAt(a));	
	                   
	                }else
	                    System.out.print(" ");
	            }
	            System.out.println("");
	        }
	    }
	  
	    public static void main(String args[]){
	        int rows = 4, columns = 4;
	  
	        print_rectangle(rows, columns);
	    }
}
