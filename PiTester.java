package com.xworkz.staticmembers;

public class PiTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("the value of pi is : "+ Pi.pi);
		
		Pi.piInit();
		Pi.AreaofCircle();
		Pi.AreaofCylinder();
		
		Pi p = new Pi();
		p.AreaoCircle();

	}
}
