package com.xworkz.multithreading.assignment;

public class PrintsNumBetween1to100Tester {

	public static void main(String[] args) {
		
    System.out.println("Thread details: " + Thread.currentThread().getName());
		
        PrintsNumBetween1to50 between1to50 = new PrintsNumBetween1to50();
		Thread t1 = new Thread(between1to50);
		t1.start();
		
		PrintsNumBetween51to100 between51to100 = new PrintsNumBetween51to100();
		Thread t2 = new Thread(between51to100);
		t2.start();
		
	System.out.println("End Thread: " + Thread.currentThread().getName());

	}

}
