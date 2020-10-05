package com.xworkz.blocks;

public class Clock1 {
	String brand;
	boolean isAnalog;
	String shape;
	
	{
		//Initialization block
		System.out.println("We are in 1st Initialization block ");
		shape="round";
	}
	
		Clock1(){
			System.out.println("Default Constructor");}
		
		Clock1(String inbrand, boolean inisAnalog, String inshape){
			brand = inbrand;			
		   isAnalog	= inisAnalog;	
			shape = inshape; }	
		
		void showingTime() {
			System.out.println("Showing time");}
		{
		System.out.println("We are  2nd in Initialization block ");
		brand="Timex";
		displayClockDetails();}
			
		void displayClockDetails() {
			System.out.println("Brand : " + brand + " isAnalog : " + isAnalog + " shape : " + shape);
			}
		
		{System.out.println("We are  3rd in Initialization block ");
		isAnalog= true;
		displayClockDetails();}		
}