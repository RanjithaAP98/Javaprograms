package com.xworkz.interfaces;

public abstract class A4Sheet implements Sheet{
	
	String brand;
	int price;
	
	public void Write() {
		System.out.println("Write on A4Sheet");
	}
	
	public void Usetoprint(){
		System.out.println("print on  the A4Sheet");
	}
		
	abstract public void packaging();
	abstract public void displayDetails();			

}
