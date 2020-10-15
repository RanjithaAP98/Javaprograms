package com.xworkz.upcastingdowncasting;

public class SpectaclesUpCastingTester {
	public static void main(String[] args) {
	
	//Upcasting
	
	Specticals specticals = new SunGlasses(); // inheritance
	specticals.setBrand("Ray-Ban");
	specticals.setPower(0.00);
	specticals.setPrice(1500.00);
	specticals.displayDetails();
	
	
	//DownCasting
	
	//Downcasting means the typecasting of a parent object to a child object.
	//Downcasting cannot be implicitly.
	
	SunGlasses sunGlasses =  (SunGlasses) new Specticals();
	sunGlasses.setBrand("Coolwinks");
	sunGlasses.setPower(1.25);
	sunGlasses.setPrice(2500);
	sunGlasses.setShape("oval");
	sunGlasses.setShade("Brown");
	sunGlasses.displayDetails();
	
	}

}
