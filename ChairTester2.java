package com.xworks.accessmodifiers.classex;

public class ChairTester2 {

public static void main(String args[]) {
		
		Chair schair = 	new Chair();
		schair.color="green"	; 
		System.out.println("color:" +schair.color);
		
		schair.moving();
		}
}
