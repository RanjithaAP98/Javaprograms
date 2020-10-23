package com.xworkz.functionalinterfaceconcept;

public class NoArgumentFITester {
	
	public static void main(String args[]) {
		
		NoArgumentFI noArgumentFI = new NoArgumentFI() {

			@Override
			public String PrintHello() {
				System.out.println("Hello World");
				return null;
			}
		};
		
		noArgumentFI.PrintHello();
	}

}
