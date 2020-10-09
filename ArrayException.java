package com.xworkz.exceptionhandling;

public class ArrayException {

	public static void main(String[] args) {
		
		System.out.println("program starts");
		
		String[] names= new String[5];
		
		names[0]="ranju";
		names[1]="jenu";
		names[2]="anu";
		names[4]="vee";
		
		 try {
			 System.out.println("inside try block");	 
			 System.out.println(names[5]);				 //Exception
		     System.out.println("ending try block");
		 }
		 catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("trying to access invalid index element");	
		}
		 
		 for(String name :names) {
			 System.out.println(name);
		 }
		 
		 System.out.println("out of try/catch block");	
		 System.out.println("program ends");
	}

}
