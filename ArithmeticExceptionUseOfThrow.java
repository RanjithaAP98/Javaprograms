package com.xworkz.exceptionhandling;

public class ArithmeticExceptionUseOfThrow {

	public static void main(String[] args) {
		
		System.out.println("program starts");
		
		int a=10, b=0;
		
		ArithmeticExceptionUseOfThrow division = new ArithmeticExceptionUseOfThrow();
		division.divisionOperation(a, b);
		
	}
	 void divisionOperation(int a, int b)   {
		 
		 if (b!=0) {
			 int result = a/b ;
			 System.out.println("Result is : " +result);
		 }
		 else {
			 System.out.println("you have entered zero divisior");
			 ArithmeticException ae = new ArithmeticException();
			 throw ae; 	 
			// System.out.println("please enter non-zero number: ");
		 }

	}

}
