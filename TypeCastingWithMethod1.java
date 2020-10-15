package com.xworkz.wrapperclass;

public class TypeCastingWithMethod1 {
	
public static void main(String[] args) {
		
		System.out.println("program starts");
		
		double a = 12.31;
		// int x = (int)a;
		TypeCastingWithMethod1 typeCastingWithMethod = new TypeCastingWithMethod1();
		typeCastingWithMethod.checkIfEven((int)a);
		
		short s = 50;
		typeCastingWithMethod.checkIfEven(s);
		
		System.out.println("program ends");
		
	}
	
	public void checkIfEven(int i) {
		System.out.println("In int method");
		if (i%2 == 0)
			System.out.println("The number "+ i +" is Even");
		else
			System.out.println("The number "+ i +" is Odd");		
	}
	
	public void checkIfEven(long l) {
		System.out.println("In long method");
		if (l%2 == 0)
			System.out.println("The number "+ l +" is Even");
		else
			System.out.println("The number "+ l +" is Odd");		
	}

}

