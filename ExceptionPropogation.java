package com.xworkz.exceptionhandling;

public class ExceptionPropogation {

	public static void main(String[] args) {
		
		ExceptionPropogation ep = new ExceptionPropogation();
		ep.method1();
	}
	
	 void method1() {
		 System.out.println("Im in method1");
		try {
			method2();
		}
		catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println("End of method1");
	}

	 void method2() {
		 System.out.println("Im in method2");
		 method3();
		 System.out.println("End of method2");
	}
	 
	 void method3() {
		 System.out.println("Im in method3");
		int result = 10/0 ;		 //Exception
		System.out.println("End of  method3");
	}
}
