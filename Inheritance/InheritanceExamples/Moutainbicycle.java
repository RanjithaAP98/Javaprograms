package com.xworkz.inheritance;

public class Moutainbicycle extends Bicycle{
	
	public int seatHeight;
	
	public Moutainbicycle (int gear, int speed, int inseatHeight) {
		super(gear, speed);
		seatHeight=inseatHeight;
	}
	
    void pedalind() {
	System.out.println("cycle pedaling"); 
    }
	
	public void displaydetails1() {
    	System.out.println("the cycle seat seatHeight is : " +seatHeight);
}
}
