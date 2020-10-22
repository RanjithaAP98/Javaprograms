package com.xworkz.interfaces;

public interface INestedInterface {
	
	void show();
	
	void Message();
	
	default public void displayDeatils() {
		System.out.println("display");
	}

}
