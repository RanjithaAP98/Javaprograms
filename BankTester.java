package com.xworkz.abstraction;

public class BankTester {
	
	public static void main(String args[]){  
		
		Bank b = new SBIbank(); 
		System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %"); 
		
		Bank b1 = new PNBbank();  
		System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %"); 
		
		}   
}
