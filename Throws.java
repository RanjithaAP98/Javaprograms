package com.xworkz.exceptionhandling;

public class Throws {
	
	int divisionOps(int x, int y ) throws Exception {
		int div = 0;
		
		div = x/ y ;
		System.out.println("The result is : " + div);
		return div;
	}

}
