package com.xworkz.multithreading.assignment;

public class PrintsNumBetween51to100 extends Thread {

	@Override
	public void run() {
		
		System.out.println("Thread details: " + Thread.currentThread().getName());
		for(int i = 51; i<=100; i++) {
			System.out.println(i);
		}
			
		System.out.println("End Thread: " + Thread.currentThread().getName());
		
	}

}
