package com.xworkz.interfaces;

public class AMBag {
	
	String brand;
	int price;
	String color;
	
	private void openingZips() { //overrriding private methods not allowed
		System.out.println("openingZips");//Cannot be instantiated in child class by creating an instance
	} 
	
	void carryThings() { //overriding only if within same package
		System.out.println("carryThings");
	}
	
	protected void storingItems() { //overriding within package / diffrent package of subclass
		System.out.println("storingItems");
	}
	
	public void adjustingStrap() { //can overriding anywhere
		System.out.println("adjustingStrap");
	}
	
	public void displayDeatiles()
	{
		System.out.println("Brand: " + brand + " Price: " + price + " Color: " + color);	
	}

}
