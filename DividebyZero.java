package com.xworkz.exceptionhandling;

public class DividebyZero {
	public static void main(String args[]) {
		
		System.out.println("start program ");
		
		 int a=10, b=0;
		 int result = 0;
		 
		 try {
			 result=a/b; // Arithmetic Exception
			 System.out.println("result: " +result);	 
		 } 
		 catch(ArithmeticException e) {
			 System.out.println("you have entered zero divisior");
		 }
		 
		 System.out.println("end of program");
			 
		 }
		 
}
