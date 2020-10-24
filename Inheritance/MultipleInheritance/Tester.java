package com.xworkz.inheritance.types.multiple;

public class Tester extends Parent1 , Parent2 { 
	
	// Tester class is inheriting from multiple classes
	// JAVA doesn't support Multiple Inheritance

	public static void main(String[] args) {
		
		Tester t = new Tester(); 
		t.fun();		
	}
}
