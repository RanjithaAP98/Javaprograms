package com.xworkz.libraryfunctionalinterface;

import java.util.function.Supplier;

public class SupplierTester {
	
	public static void main(String[] args) {
		  
		  Supplier<String> SupplierTester = ()-> "Ranjitha";
		  
		  System.out.println(SupplierTester.get());
		  
		 }

}
