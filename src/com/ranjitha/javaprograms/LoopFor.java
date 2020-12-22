package com.ranjitha.javaprograms;

public class LoopFor {

	public static void main(String[] args) {
		// When you know exactly how many times you want to loop through a block of code,
		//use the for loop instead of a while loop
		
		for (int i = 0; i < 5; i++) {
			  System.out.println(i);
			}
		System.out.println("Even numbers between 0 and 10 :");
		for (int i = 0; i <= 10; i = i + 2) {
			  System.out.println(i);
			}
	}

}
