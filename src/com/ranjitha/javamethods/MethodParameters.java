package com.ranjitha.javamethods;

public class MethodParameters {
	
	static void myMethod(String fname) { //parameter
	    System.out.println(fname + " Refsnes"); 
	  }

	  public static void main(String[] args) {
	    myMethod("Liam");
	    myMethod("Jenny");     //arguments
	    myMethod("Anja");
	  }//When a parameter is passed to the method, it is called an argument.
	  //So, from the example above: fname is a parameter, while Liam, Jenny and Anja are arguments	 
	  
}
