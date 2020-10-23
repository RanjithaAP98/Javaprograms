package com.xworkz.constructorchaining;

public class Derived extends Base {
	
	  
	 public Derived() // default constructor
	  {
	    this(20);
	    System.out.println("Derived class default constructor called");
	  }

	  
	 public Derived(int x) // parameterized constructor
	  {
	    super();
	    System.out.println("Derived class parameterized constructor called");
	  }

}   //CAUTION: can not call the this() and super() methods in the same constructor block.
