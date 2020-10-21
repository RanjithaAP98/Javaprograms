package com.xworkz.interfaces;

public class Button  implements Clickable, Accessible {

	@Override
	public void Print() {
		System.out.println("print");	
	}

	@Override
	public void printing() {
		System.out.println("printing");	
	}

	@Override
	public void displayDetails() {
		System.out.println("duplicate dufault methods : displayDetails ");	
	
	}
	 
}
