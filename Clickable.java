package com.xworkz.interfaces;

public interface Clickable {
	
	void Print();
	
	default void click(){
		System.out.println("click");
	}
	
	default void displayDetails(){
		System.out.println("display click");
	}

}
