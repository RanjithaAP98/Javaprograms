package com.xworkz.arrayexample;

public class DoubleExample2 {

	public static void main(String[] args) {
		
		double[] myList = {1.9, 2.9, 3.4, 3.5};
		
		System.out.println("The list of double numbers are : ");
		
		System.out.println(myList[0]);
		
		int lent= myList.length;
		
		  for (int i = 0; i <lent; i++) {
		       System.out.println( +myList[i]);
		}
		  // Foe each loop
		  for(double i : myList) {
			  System.out.println(" double numbers is : " +i);
		  }		
}
}