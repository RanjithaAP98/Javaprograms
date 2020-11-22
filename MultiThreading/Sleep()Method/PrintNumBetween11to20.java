package com.xworkz.multithreading.sleepmethod;

public class PrintNumBetween11to20 implements Runnable {

	@Override
	public void run() {
		
		System.out.println("Thread details: " + Thread.currentThread().getName());
		for(int i = 11; i<=20; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("End Thread: " + Thread.currentThread().getName());
		
	}
}
