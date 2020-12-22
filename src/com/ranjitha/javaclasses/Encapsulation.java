package com.ranjitha.javaclasses;

public class Encapsulation {
	private String name; // private = restricted access

	  // Getter
	  public String getName() {
	    return name;
	  }

	  // Setter
	  public void setName(String newName) {
	    this.name = newName;
	  }

}
 //Syntax for both is that they start with either get or set,
//followed by the name of the variable, with the first letter in upper case
