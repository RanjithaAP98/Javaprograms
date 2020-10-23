package com.xworkz.constructorchaining;

public class ConstructorChaining {
	
	
	public ConstructorChaining() // default constructor
	  {
	    this(20);
	    System.out.println("Default constructor called");
	  }

	  
	 public ConstructorChaining(int x) // parameterized constructor
	  {
	    System.out.println("Parameterized constructor called");
	  }

}
