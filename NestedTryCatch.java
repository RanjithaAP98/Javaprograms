package com.xworkz.exceptionhandling;

public class NestedTryCatch {

	public static void main(String[] args) {
		System.out.println("start program ");
		
		String str = "123";
		try {
			System.out.println("First try started");
			int result = Integer.parseInt(str);
			
			try {
				System.out.println("Second try started");
				int array[] = {1,2,3};
				System.out.println(array[5]);
				System.out.println("Second try ended");
			}
			catch(NullPointerException e) {
				System.out.println("Trying to access null object");
			}
			System.out.println("First try ended");
			}
		catch(NumberFormatException e) {
			System.out.println("Trying to convert a wrong String to number");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("you are trying to access invalid index element");	
		}
		 System.out.println("programs ends");
		
	}

}
