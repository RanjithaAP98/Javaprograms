package com.xworkz.arrayexample;

public class ChargerTester {

	public static void main(String[] args) {
		
		Charger[] chargerarray = new Charger[2];
		
		Charger mobilecharger = new Charger();
		mobilecharger.brand="Sony";
		mobilecharger.price=500.00f;
		mobilecharger.isUsb=true;
		chargerarray[0]= mobilecharger;
		
		Charger laptopcharger = new Charger();
		laptopcharger.brand="Lenevo";
		laptopcharger.price=800.00f;
		laptopcharger.isUsb=true;
		chargerarray[1]= laptopcharger;
		
		System.out.println("Accessing first element in the chargerarray");
		Charger a = chargerarray[0];
		a.displayDetails();
		
		System.out.println();
		System.out.println("Displaying  all  element in the chargerarray");
		for(int i=0; i<chargerarray.length; i++) {
			if(chargerarray[i]!=null) {
				Charger a1 = chargerarray[i];
				a1.displayDetails();
			}
		}
		System.out.println();
		System.out.println("print using for each loop");
		 for(Charger a2 : chargerarray) {
			 if(a2!= null) {
				 a2.displayDetails();
			 }
		 }
}
}