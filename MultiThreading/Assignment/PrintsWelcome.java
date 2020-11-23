package com.xworkz.multithreading.assignment;

public class PrintsWelcome implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread details: " + Thread.currentThread().getName());
		
		for(int i = 1; i<=10; i++) {
			System.out.println("Welcome");
		}
	
		System.out.println("End Thread: " + Thread.currentThread().getName());
	
	}

}
