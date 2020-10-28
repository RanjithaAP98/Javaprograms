package com.xworkz.libraryfunctionalinterface;

import java.util.function.Consumer;

public class ConsumerTester {
	
	 public static void main(String args[]) { 
		 
		  // void accept( T t );
	       Consumer<Integer> displayNumber = (a) -> System.out.println("The entered Number is: " + a); 
	  
	         
	       displayNumber.accept(10); // Implement displayNumber using accept()
	       displayNumber.accept(20);
	  
	 }
}
