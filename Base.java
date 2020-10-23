package com.xworkz.constructorchaining;

public class Base {
	
	  
	 public  Base() // default constructor
	  {
	    this(10);
	    System.out.println("Base class default constructor called");
	  }

	  
	 public  Base(int x) // parameterized constructor
	  {
	    System.out.println("Base class parameterized constructor called");
	  }

}
