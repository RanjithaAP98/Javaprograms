package com.xworkz.staticmembers;

public class RoadTester {
	
	public static void main(String args[]) {
		
		System.out.println("the color of road is : " + Road.color);
		Road.initcolor();
		
		Road rd = new Road("nationalHighway", true);
		rd.displayDetails();
		
		Road rd1 = new Road("districtHighway", true);
		rd1.displayDetails();
		
		Road.color="gray";
		
		Road rd2 = new Road("villageroad", false);
		rd2.displayDetails();
	}
}
