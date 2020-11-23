package com.xworkz.multithreading.synchronization;

public class MultiplOf4 implements Runnable {

	MultiplesOfNumbers multiplesOfNumbers;
	
	public MultiplOf4(MultiplesOfNumbers multiplesOfNumbers) {
		this.multiplesOfNumbers = multiplesOfNumbers;
	}
	
	@Override
	public void run() {
		Thread.currentThread().setName("Multiples of 4");
		multiplesOfNumbers.printMultiplesOfNumbers(4);
		
	}

}
