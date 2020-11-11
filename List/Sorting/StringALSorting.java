package com.xworkz.collectionconcept.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class StringALSorting {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Ranjitha");
		names.add("Gagana");
		names.add("Amrutha");
		names.add("Anusha");
		names.add("JenuShree");
		names.add("Veena");
		
		System.out.println("Before Sorting: " + names);
		
		//Sorting in Ascending Order
		Collections.sort(names);
		System.out.println();
		System.out.println("Sorted ArrayList in Ascending order: " +names);
		
		//Decending Order -->  Collections.sort(ArrayList, Collections.reverseOrder());
		Collections.sort(names, Collections.reverseOrder());
		System.out.println();
		System.out.println("Sorted ArrayList in Descending order: " +names);
		
		
	}

}
