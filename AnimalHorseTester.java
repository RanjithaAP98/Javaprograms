package com.xworkz.abstraction;

public class AnimalHorseTester {
	
	 public static void main(String[] args) {
		 
		 Horse hrs = new Horse(); // Create a Horse object
		 	hrs.sleep();
		    hrs.animalSound();
		    hrs.eat();
		    
		    System.out.println();
		    Animal anl = new Horse(); //Upcasting
		    anl.sleep();
		    anl.animalSound();
		    anl.eat();
		  }

}
