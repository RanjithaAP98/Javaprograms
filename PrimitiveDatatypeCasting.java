package com.xworkz.wrapperclass;

public class PrimitiveDatatypeCasting {

	public static void main(String[] args) {
		System.out.println("program starts");
		
		//Auto widening
		
		byte b = 1; 		//8bits or 1 byte
		System.out.println("The value of b :" +b);
		
		short s = b; 		// 2 bytes
		System.out.println("The value of s :" +s);
		
		int i = s; 			//4 bytes
		System.out.println("The value of i :" +i);
		
		double d = i;		//8bytes
		System.out.println("The value of d :" +d);
		
		//Explict narrowing
		
		double y = 11.23;
		int x = (int)y;  //11.23 ==>11
		System.out.println("The value of x :" +x);
		
		long l = 2358962110000l;
		System.out.println("The value of  l:" +l);
		
		byte z = (byte)l;
		System.out.println("The value of  z:" +z);
		
		
		System.out.println("program ends");

	}

}
