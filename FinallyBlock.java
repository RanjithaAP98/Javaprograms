package com.xworkz.exceptionhandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		String str = null;  
		
		try {
			int length = str.length();
			System.out.println("Try block executes Sucessfully");
		}
		catch(NullPointerException e) {
			System.out.println("Null pointer exception");
		}
		finally {
			System.out.println("This is final");
				
			}
	}

}
