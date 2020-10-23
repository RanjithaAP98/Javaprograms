package com.xworkz.functionalinterfaceconcept;

public class MultiArgumentFITester {
	
	public static void main(String args[]) {
		
		MultiArgumentFI multiArgumentFI =(str1, str2)-> {
			System.out.println("The String Concatenation of 2 Strings is  : "+ (str1 + str2));
			return null;
		};
		
		multiArgumentFI.ConcatTwoString("Hello" ," World");
		
	}	

}
