package com.xworkz.staticmembers;

public class Pi {
	static double pi;
	
	static void piInit() {
		pi=22/7;
		System.out.println("the value of pi:" + pi);
	}
	
	static void AreaofCircle()
	{
		double r = 2.0;
		double area = pi*r*r;
		System.out.println("the area of circle is: " + area);	
	}

	static void AreaofCylinder() {
		double r = 2.0, h=4.0;
		double area = (2*pi*r*h)+(2*pi*r*r);
		System.out.println("the area of cylinder is: " + area);	
	}
	
	 void AreaoCircle()
	{
		double r = 2.0;
		double area = pi*r*r;
		System.out.println("the area of circle is: " + area);	
	}	
}
