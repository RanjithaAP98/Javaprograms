package com.xworkz.multithreading.synchronization;

public class MultiplOf8 implements Runnable {
	
	MultiplesOfNumbers multiplesOfNumbers;
	
	public MultiplOf8(MultiplesOfNumbers multiplesOfNumbers) {
		this.multiplesOfNumbers = multiplesOfNumbers;
	}
	
	@Override
	public void run() {
		Thread.currentThread().setName("Multiples of 8");
		multiplesOfNumbers.printMultiplesOfNumbers(8);
		
	}

}
