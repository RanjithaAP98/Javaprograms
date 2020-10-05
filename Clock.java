package com.xworkz.blocks;

public class Clock {
	String brand;
	boolean isAnalog;
	String shape;
	
	{
		//Initialization block
		System.out.println("We are in Initialization block ");
		brand="Timex";
		isAnalog= true;
		shape="round";
	}
	
		Clock(){
			System.out.println("Default Constructor");}
		
		Clock(String inbrand, boolean inisAnalog, String inshape){
			brand = inbrand;			
		   isAnalog	= inisAnalog;	
			shape = inshape; }	
		
		void showingTime() {
			System.out.println("Showing time");}
			
		void displayClockDetails() {
			System.out.println("Brand : " + brand + " isAnalog : " + isAnalog + " shape : " + shape);
			}
}
