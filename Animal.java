package com.xworkz.interfaces;

public class Animal implements AnimalEat, AnimalTravel {
	
	//multiple inheritance by interface  
	   public void eat() {
		      System.out.println("Animal is eating");
		   }
	   
	   public void travel() {
		      System.out.println("Animal is travelling");
		   }
}
