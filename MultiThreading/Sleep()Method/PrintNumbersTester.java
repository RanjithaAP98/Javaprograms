package com.xworkz.multithreading.sleepmethod;

public class PrintNumbersTester {

	public static void main(String[] args) {
		
		System.out.println("Thread details: " + Thread.currentThread().getName());
		
		PrintNumBetween1to10 between1to10 = new PrintNumBetween1to10();
		Thread t1 = new Thread(between1to10);
		t1.start();
		
		PrintNumBetween11to20 between11to20 = new PrintNumBetween11to20();
		Thread t2 = new Thread(between11to20);
		t2.start();
		
		System.out.println("End Thread: " + Thread.currentThread().getName());
	}

}
