package com.xworkz.libraryfunctionalinterface;

import java.util.function.Function;

public class FunctionTester {
	
	public static void main(String args[])  { 
		
        // R apply( T t);
        Function<Integer, Double> halfOfNumber = (a) -> a / 2.0; // Function which takes in a number and returns half of it 
  
        
        System.out.println(halfOfNumber.apply(10)); // apply the function to get the result 
        
    } 

}
