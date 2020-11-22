package com.xworkz.multithreading;

public class MultipleOfFive1 extends Thread {
	
	@Override
	public void run() {
		
		System.out.println("Thread details are: " + Thread.currentThread().getId() + 
				" Name: "+ Thread.currentThread().getName());
		
		int num = 5;
		for(int i=1; i<=5; i++) {
			System.out.println(num + " * "+ i + " = " + (num*i)); //5*1
		}
		
		System.out.println("End of Thread: " + Thread.currentThread().getId() + 
				" Name: "+ Thread.currentThread().getName());
		
	}
	
}
