package com.xworkz.interfaces;

public class Square implements Rectangle {
	
	int length = 4;
	int width = 4;
	
	public void getSides() {
		System.out.println("I can get sides of a polygon.");
	}
	
	public void getArea() {
		 System.out.println("The area of the rectangle  = length * breadth;");
	}
	
	public void displayDetals() {
		System.out.println("Length: " + length + " Width: " + width + " Perimeter: " + perimeter + " NumberOfsides: " + numberOfsides);
	}

}
