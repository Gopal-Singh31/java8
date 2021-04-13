package com.beginnerjava8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class RemoveDuplicatesFromListMain {
	public static void main(String[] args)    {
        Integer[] arr=new Integer[]{100,24,13,44,114,200,40,112};
        
        List<Integer> list = Arrays.asList(arr);
        
        OptionalDouble average = list.stream()
                                 .mapToInt(n->n*n)
                                 .filter(n->n>10000)
                                 .average();
 
        if(average.isPresent())
            System.out.println(average.getAsDouble());
        
        
        System.out.print("\n===================================\n"); 
        
        OptionalDouble average1 = list.stream()
                .mapToInt(n->n*n)
                .filter(n->!(n>10000))
                .average();
                
        if(average1.isPresent())
            System.out.println(average1.getAsDouble());
                
    }
}
