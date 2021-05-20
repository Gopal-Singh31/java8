package com.beginnerjava.string;

import java.io.IOException;
import java.util.Scanner;

/*In how many ways, can you pay N rupees with 1 rupee, 2 rupee & 5 rupee denominations, in such a way that the number of 1 rupee coins are always greater than that of 2 rupee coins and number of 2 rupee coins are always greater than that of 5 rupee coins.

Note: At least one coin should be given from each denomination.


Input Format
The only line of input consists of a single integer, N, the amount in rupees.


Constraints
1 <= N <= 100

Output Format
Print the number of ways in which you can pay the amount as described.*/


public class Ruppess {
	
        public static void main(String[] args) throws IOException{
                int amt,  r5=0, r2=0 , r1=0 ,count=0; 
                Scanner sc = new Scanner(System.in);
         
                System.out.print("Enter The Amount in Rupees : \n\n");
                amt = sc.nextInt();
         
         while(amt >= 5) 
         { 
          r5 = amt / 5 ; 
          amt = amt % 5;
          System.out.print("\nTotal Number Of 5 Rupees Notes Or Coin : "+ r5) ; 
          break ; 
         } 
         while(amt >= 2) 
         { 
          r2 = amt / 2 ; 
          amt = amt % 2;
          System.out.print("\nTotal Number Of 2 Rupees Notes Or Coin : "+ r2) ; 
          break ; 
         } 
         while(amt >= 1) 
         { 
          r1 = amt / 1 ; 
          amt = amt % 1;
          System.out.print("\nTotal Number Of 1 Rupees Note Or Coin : "+ r1) ; 
          break ; 
         }
         count =  r5 + r2 + r1;   
         System.out.print("\n\nTotal Number Of Notes Require : \n\n"+ count) ; 
       }
        
}
