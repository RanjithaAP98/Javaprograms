package com.xworkz.collectionconcept.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class DoubleALSorting {

	public static void main(String[] args) {
		
		ArrayList<Double> dlist =  new ArrayList<Double>();  //Creating arraylist  
		
		dlist.add(10.00); //Adding object in arraylist
		dlist.add(12.98);
		dlist.add(15.16);
		dlist.add(25.60);
		dlist.add(32.00);
		dlist.add(5.10);
		dlist.add(40.02);
		dlist.add(10.50);
		dlist.add(18.00);
		dlist.add(20.00);
		
		System.out.println("Before Sorting: " +dlist);
		
		//Ascending Order
		Collections.sort(dlist);
		System.out.println();
		System.out.println("Sorted ArrayList in Ascending order: " +dlist);
		
		//Decending Order -->  Collections.sort(ArrayList, Collections.reverseOrder());
		Collections.sort(dlist, Collections.reverseOrder());
		System.out.println();
		System.out.println("Sorted ArrayList in Descending order: " +dlist);
		
	}

}
