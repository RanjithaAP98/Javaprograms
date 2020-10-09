package com.xworkz.exceptionhandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		
	int a=10, b=0;
	int[] array = {1, 2, 3, 4 , 5};
	
	try {
		int result = a/b; //Exception
		System.out.println("Result is : " +result);
		
		System.out.println(array[10]); // Exception
		
		String str = null;   //Exception
		str.length();
	}
	catch(ArithmeticException e) {
			 System.out.println("you have entered zero divisior");
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("trying to access invalid index element");	
	}
	catch(NullPointerException e) {
		System.out.println("Trying to access null object");
	}
	System.out.println("End program");
}
}