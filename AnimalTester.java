package com.xworkz.abstraction;

public class AnimalTester {
	public static void main(String args[]) {
		
		Animal myObj = new Animal(); // will generate an error
		myObj.animalSound();         // can't create an instance of Abstract class
		myObj.eat();
		myObj.sleep();
		
		//From the Animal class, it is not possible to create an object of the Animal class
	}

}
