package com.xworkz.multithreading.assignment;

public class PrintsNumBetween1to50 extends Thread {

	@Override
	public void run() {
		
		System.out.println("Thread details: " + Thread.currentThread().getName());
		for(int i = 1; i<=50; i++) {
			System.out.println(i);
		}
			
		System.out.println("End Thread: " + Thread.currentThread().getName());
		
	}

}
