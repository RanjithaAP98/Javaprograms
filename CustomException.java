package com.xworkz.exceptionhandling;

public class CustomException extends RuntimeException {
	
	public CustomException() {

		super("enter a number greater than zero"); 

	}
}