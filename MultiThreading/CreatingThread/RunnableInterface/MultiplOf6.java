package com.xworkz.multithreading.runnableinterface;

public class MultiplOf6 implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Thread details are: " + Thread.currentThread().getId() + 
				" Name: "+ Thread.currentThread().getName());
		
		int num = 6;
		for(int i=1; i<=10; i++) {
			System.out.println(num + " * " + i + " = " +(num*i));
		}
		
		System.out.println("End od Thread: " + Thread.currentThread().getId() + 
				" Name: "+ Thread.currentThread().getName());
		
	}
}
