package com.xworkz.arrayexample;

public class ClockarrayTester {

	public static void main(String[] args) {
		
		Clockarray[] clock = new Clockarray[3];
		
		Clockarray Timex = new Clockarray();
		Timex.brand= "timex";
		Timex.isAnalog = true;
		Timex.shape= "round";
		clock[0]=Timex;
		
		Clockarray Titan = new Clockarray();
		Titan.brand= "titan";
		Titan.isAnalog = false;
		Titan.shape= "square";
		clock[1]=Titan;
		
		for(Clockarray c : clock) {
			if(c != null)
				c.displayClockDetails();
		}

	}

}
