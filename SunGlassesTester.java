package com.xworkz.upcastingdowncasting;

public class SunGlassesTester {

	public static void main(String[] args) {
		System.out.println("Begin program");
		
		System.out.println("Creating instance of Child class");
		SunGlasses sunGlasses = new SunGlasses(); // inhertance
		sunGlasses.setBrand("Fastrack");
		sunGlasses.setPower(0.00);
		sunGlasses.setPrice(2000.00);
		sunGlasses.setShade("Olive");
		sunGlasses.setShape("Round");
		sunGlasses.displayDetails();
		
		System.out.println();
		System.out.println("Creating instance of Parent class");
		Specticals Specticals = new Specticals(); //new Specticals("Titan", 1.75, 1000.00);
		Specticals.setBrand("Titan");
		Specticals.setPower(1.75);
		Specticals.setPrice(1000.00);
		Specticals.displayDetails();
		
		
		
		
		
		
		System.out.println("End program");
	}

}

