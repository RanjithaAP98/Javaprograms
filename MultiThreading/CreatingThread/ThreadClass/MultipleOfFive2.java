package com.xworkz.multithreading;

public class MultipleOfFive2 extends Thread {

	@Override
	public void run() {
		
		System.out.println("Thread details are: " + Thread.currentThread().getId() + 
				" Name: "+ Thread.currentThread().getName());
		
		int num = 5;
		for(int i=6; i<=10; i++) {
			System.out.println(num + " * "+ i + " = " + (num*i)); 
		}
		
		System.out.println("End of Thread: " + Thread.currentThread().getId() + 
				" Name: "+ Thread.currentThread().getName());
		
	}
	
	
}
