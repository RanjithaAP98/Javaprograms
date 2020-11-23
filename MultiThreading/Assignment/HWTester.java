package com.xworkz.multithreading.assignment;

public class HWTester {

	public static void main(String[] args) {
		
		 System.out.println("Thread details: " + Thread.currentThread().getName());
			
		    PrintsHello printsHello = new PrintsHello();
			Thread t1 = new Thread(printsHello);
			t1.start();
			
			PrintsWelcome printsWelcome = new PrintsWelcome();
			Thread t2 = new Thread(printsWelcome);
			t2.start();
			
		System.out.println("End Thread: " + Thread.currentThread().getName());
		
	}

}
