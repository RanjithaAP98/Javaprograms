package com.xworkz.inheritance;

public class Bicycle {
	
	public int gear;
	public int speed;
	
	public Bicycle() {
		System.out.println("defult constructor");
	}

	public Bicycle(int ingear, int inspeed) {
		gear=ingear;
		speed=inspeed;}
		
	 public void applyBreak() {
		System.out.println("the speed is decremented");
		}
     public void speedUp() {
    	 System.out.println("the speed is incremented"); }
    
    public void displaydetails() {
    	System.out.println("No of gears are : " +gear);
    	System.out.println("Speed of bicycle is : " +speed);
    }
 }
