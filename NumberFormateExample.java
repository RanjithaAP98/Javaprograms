package com.xworkz.exceptionhandling;

public class NumberFormateExample {

	public static void main(String[] args) {
		System.out.println("Begin program");
		
		String str ="123";
		
		int num = Integer.parseInt(str);
		System.out.println("The number is : " +num);
		
		String name = "Ranju";
		try {
			int result = Integer.parseInt(name);
			System.out.println(" The result is : " +result);
		} 
		catch(NumberFormatException e) {
			System.out.println("Formating wrong String to number");
		}
		System.out.println("programs ends");	
	}

}
