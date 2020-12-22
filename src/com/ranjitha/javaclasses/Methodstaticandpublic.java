package com.ranjitha.javaclasses;

public class Methodstaticandpublic {
	//a static method, which means that it can be accessed without creating an object of the class,
	//public, which can only be accessed by objects
	
	// Static method
	  static void myStaticMethod() {
	    System.out.println("Static methods can be called without creating objects");
	  }

	  // Public method
	  public void myPublicMethod() {
	    System.out.println("Public methods must be called by creating objects");
	  }

	  // Main method
	  public static void main(String[] args) {
	    myStaticMethod(); // Call the static method
	    
	    // myPublicMethod(); This would compile an error
	    Methodstaticandpublic myObj =new  Methodstaticandpublic(); // Create an object of class Methodstaticandpublic
	    myObj.myPublicMethod(); // Call the public method on the object
	  }
}
