package com.xworkz.multithreading.assignment;

public class PrintsHello implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread details: " + Thread.currentThread().getName());
		
		for(int i = 1; i<=5; i++) {
			System.out.println("Hello");
		}
	
		System.out.println("End Thread: " + Thread.currentThread().getName());
	
	}

}
