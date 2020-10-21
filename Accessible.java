package com.xworkz.interfaces;

public interface Accessible {
	
	void  printing();
	
	default void access(){
		System.out.println("access");
	}
	
	default void displayDetails(){
		System.out.println("display access");
	}

}
