package com.xworkz.wrapperclass;

public class IntegerWrapperClass {
	
public static void main(String[] args) {
		
		System.out.println("program starts");
		
		int a = 10;
		Integer b = new Integer(a); // Boxing 		// Wrapping
		System.out.println("The value of b is : " +b);
		
		Integer c = a ;  //AutoBoxing
		System.out.println("The value of c is : " +c);
		
		
		int  d = Integer.valueOf(b); //Unboxing // UnWrapping
		System.out.println("The value of d is : " +d);
		
		int f =  b; // AutoUnboxing
		System.out.println("The value of f is : " +f);
		
		System.out.println("program ends");
	}

}
