package com.xworkz.interfaces;

public class A6SheetTester {

	public static void main(String[] args) {
		
		System.out.println("Child class");
		A6Sheet a6s = new A6Sheet();
		a6s.brand="vidya";
		a6s.price=150;
		a6s.thikness=10;
		a6s.packaging();
		a6s.Usetoprint();
		a6s.Write();
		a6s.displayDetails();
		
		System.out.println();
		System.out.println("Parent class");
		A4Sheet a4s = new A6Sheet();
		a4s.brand="Classmat";
		a4s.price=200;
		a4s.displayDetails();
	}
	
}
