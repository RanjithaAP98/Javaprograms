package com.xworkz.multithreading.runnableinterface;

public class MultiplOf12 implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Thread details are: " + Thread.currentThread().getId() + 
				" Name: "+ Thread.currentThread().getName());
		
		int num = 12;
		for(int i=1; i<=10; i++) {
			System.out.println(num + " * " + i + " = " +(num*i));
		}
		
		System.out.println("End od Thread: " + Thread.currentThread().getId() + 
				" Name: "+ Thread.currentThread().getName());
		
	}

}
