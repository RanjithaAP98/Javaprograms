package com.xworkz.interfaces;

public class AMBagTester extends AMBag {

	public static void main(String[] args) {
		
		AMBag bag = new AMBag();
		bag.brand = "SKYbags";
		bag.price = 2000;
		bag.color = "Skyblue";
		bag.displayDeatiles();
		bag.carryThings();
		bag.storingItems();
		bag.adjustingStrap();
		
	}

}
