package com.xworks.accessmodifiers.classex;

public class ChairTester {
	public static void main(String args[]) {
		
	Chair woodenchair= new Chair();	
	woodenchair.material="wood"	; 
	System.out.println("material:" +woodenchair.material);
	
	woodenchair.moving();
	
	Chair woodenchair1= new Chair();	// protected
	woodenchair1.price=12.909; 
	System.out.println("price of chair:" +woodenchair1.price);
	
	
	
	}
}
