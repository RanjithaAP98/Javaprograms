package com.xworkz.staticmembers;

public class Road {

	String type;
	static String color;
	boolean isOneway;
	
	static {
		//init static varialblrs
	     color= "brown";
	}
	
	public Road(String intype,  boolean inisOneway) {
		type = intype;
	   isOneway = inisOneway; }
	
	static void initcolor() {
		color = "black";
		System.out.println("The color of road is now :" + color);
	}
	
	void travelling() {
		System.out.println("..........");
	}
	 void displayDetails() {
		 System.out.println("Type: " + type + " Color: " +color + " isOneway: " + isOneway);
	 }	
}