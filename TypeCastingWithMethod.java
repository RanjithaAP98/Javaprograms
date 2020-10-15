package com.xworkz.wrapperclass;

public class TypeCastingWithMethod {

	public static void main(String[] args) {
		
		System.out.println("program starts");
		
		double a = 12.31;
		
		TypeCastingWithMethod typeCastingWithMethod = new TypeCastingWithMethod();
		typeCastingWithMethod.checkIfEven((int)a);
		
		System.out.println("program ends");
		
	}
	
	public void checkIfEven(int i) {
		
		if (i%2 == 0)
			System.out.println("The number "+ i +" is Even");
		else
			System.out.println("The number "+ i +" is Odd");		
	}

}
