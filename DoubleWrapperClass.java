package com.xworkz.wrapperclass;

public class DoubleWrapperClass {
	
	public static void main(String[] args) {
	
	System.out.println("program starts");
	
	double d = 11.23;
	Double  d1 = new Double (d); // Boxing 		// Wrapping
	System.out.println(d1);
	
	Double  d2 = d ;  //AutoBoxing
	System.out.println(d2);
	
	
	double d3 = Double.valueOf(d1); //Unboxing // UnWrapping
	System.out.println(d3);
	
	double  d4 = d1; // AutoUnboxing
	System.out.println(d3);
	
	System.out.println("program ends");
}

}
