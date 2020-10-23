package com.xworkz.functionalinterfaceconcept;

public class OneArgumentFITester {
	
	public static void main(String args[]) {
	
		OneArgumentFI oneArgumentFI =(a)-> {
			System.out.println("Using Lamba expression add 5 to the input paremeter a : " +(a+5));
			return a;
		};
		
		oneArgumentFI.incrementByFive(5);
		
	}	

}  // OUTPUT : Using Lamba expression add 5 to the input paremeter a : 10

