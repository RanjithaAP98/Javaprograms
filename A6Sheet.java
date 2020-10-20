package com.xworkz.interfaces;

public class A6Sheet extends A4Sheet {
	
	int thikness;

	@Override
	public void Write() {
		System.out.println("Write on A6Sheet");
	}

	@Override
	public void Usetoprint() {
		System.out.println("print on  the A6Sheet");
			}

	@Override
	public void packaging() {
		System.out.println("Use A6Sheet to pack materials");
	}

	@Override
	public void displayDetails() {
		System.out.println("Brand: " +brand + " price: " +price + " thikness: " +thikness);	
	}
	
}
