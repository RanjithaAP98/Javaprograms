package com.xworkz.exceptionhandling;

public class ThwowsTester {

	public static void main(String[] args) {
		int a=10, b=0;
		
		Throws division = new Throws();
		try {
			division.divisionOps(a, b);
		}
		catch (Exception e) {
			System.out.println("Division operation is failed due to wrong input");
		}
	}

}
