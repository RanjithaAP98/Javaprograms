package com.xworkz.abstraction;

	public abstract class Animal {   // Abstract class
		
	  // Abstract method (does not have a body)
	  public abstract void animalSound(); // Abstract/incomplete method
	  
	  abstract void eat(); //method declaring
	  
	  
	  // Regular method // complete method // concrete method
	  public void sleep() {
	    System.out.println("Zzz");
	  }
}
