package com.xworkz.multithreading.synchronization;

public class MultiplesOfNumbersTester {

	public static void main(String[] args) {
		
		System.out.println("Thread details: " + Thread.currentThread().getName());
		
		MultiplesOfNumbers multiplesOfNumbers = new MultiplesOfNumbers(); //Common resource
		
		MultiplOf4 multiplOf4 = new MultiplOf4(multiplesOfNumbers);
		Thread t1 = new Thread(multiplOf4);
		t1.start();
		
		MultiplOf8 multiplOf8 = new MultiplOf8(multiplesOfNumbers);
		Thread t2 = new Thread(multiplOf8);
		t2.start();
		
		System.out.println("Ending Thread details: " + Thread.currentThread().getName());
		
		

	}

}
