package com.xworkz.interfaces;

public class AMSlingBag extends AMBag {
	
	//@Override
	//private void openingZips() { 
	//	System.out.println(" child class: openingZips");
	//}  

	@Override
	void carryThings() {
		System.out.println("child class: carryThings ");
	}

	@Override
	protected void storingItems() {
		System.out.println("child class: storingItems");
	}

	@Override
	public void adjustingStrap() {
		System.out.println("child class: adjustingStrap");
	}

	
}
