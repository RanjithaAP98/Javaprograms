package com.xworkz.collectionconcept;

import java.util.ArrayList;

public class DoubleArrayList {

	public static void main(String[] args) {
		
		ArrayList<Double> dlist =  new ArrayList<Double>();  //Creating arraylist   
		
		dlist.add(10.00); //Adding object in arraylist
		dlist.add(12.98);
		dlist.add(15.16);
		dlist.add(25.60);
		dlist.add(32.00);
		
		System.out.println("size of the array is: "+dlist.size()); //check the size
		
		System.out.println();
		System.out.println("Traversing using for():");
		for(int i=0; i<dlist.size(); i++) //Printing the arraylist object using for loop 
			System.out.println(dlist.get(i));
		
		System.out.println();
		System.out.println("Traversing using forEach():");
		for(Double i : dlist) //Printing the arraylist object using for-each loop 
		System.out.println(i);
		
		System.out.println(); //updating	
		dlist.set(2,56.23);
		System.out.println(dlist);
		
		System.out.println();		
		System.out.println(dlist.get(dlist.size()-1)); //displat last element in array
		
		System.out.println();
		dlist.remove(0);   //remove 1st element
		System.out.println(dlist);
		
		System.out.println();		
		dlist.remove(new Double(56.23));
		System.out.println(dlist);
		
	}

}
