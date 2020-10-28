package com.xworkz.libraryfunctionalinterface;

import java.util.function.Predicate;

public class PredicateTester {
	
	 public static void main(String[] args)  { 
		 
	        Predicate<Integer> predicate = (i) -> (i < 20);   // Creating predicate 
	  
	       
	        System.out.println(predicate.test(10));    // Calling Predicate method 
	        System.out.println(predicate.test(30));  
	    } 
}
