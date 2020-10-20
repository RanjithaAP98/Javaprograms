package com.xworkz.interfaces;

public class SmaetWatchTester {

	public static void main(String[] args) {
		
		SmartWatch sw = new SmartWatch();
		System.out.println("The Watch brand is :" +sw.brand);
		System.out.println("Thw watch belt is :"+SmartWatch.belt);
		sw.Showingtime();
		
		Watch w = new Watch();
		System.out.println("The Watch brand is :" +w.brand);
		System.out.println("The parent watch belt is :"+Watch.belt);
		w.Showingtime();
		
		Watch watch = new SmartWatch(); //ref variable
		System.out.println("The Watch brand is :" +watch.brand);
		System.out.println("Thw watch belt is :"+Watch.belt);
		sw.Showingtime();
	}

}
