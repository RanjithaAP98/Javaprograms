package com.xworkz.multithreading.synchronization;

public class MultiplesOfNumbers {
	
	synchronized void printMultiplesOfNumbers(int num) {
		
		System.out.println("Thread details: " + Thread.currentThread().getName());
		
		for(int i = 1; i<=10; i++) {
			System.out.println(num + " * " + i + " = " +(num*i));
		}
		
		System.out.println("Ending Thread details: " + Thread.currentThread().getName());
		
	}

}
