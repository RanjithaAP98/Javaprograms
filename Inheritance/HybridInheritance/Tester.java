package com.xworkz.inheritance.types.hybrid;

public class Tester {
	
	public static void main (String args[]) {
		
		Child c = new Child();
		c.print_concept();
		
		parents p = new parents();
		p.print_of();
		
		c.print_something();	
	}
}
