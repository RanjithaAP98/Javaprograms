package com.ranjitha.javaclasses;

public class InheritanceCar extends InheritanceVehicle {
	
		  private String modelName = "Mustang";  // Car attribute
		  
		  public static void main(String[] args) {
			  
			  InheritanceCar myCar = new InheritanceCar();
			  myCar.honk();

		  System.out.println(myCar.brand + " " + myCar.modelName);
		  }
}
		 

		