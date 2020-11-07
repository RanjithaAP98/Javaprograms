package com.xworkz.collectionconcept;

import java.util.ArrayList;

public class CollectionExample {

	public static void main(String[] args) {
		
		int[] ref = new int[10];
		ref[0] = 10;
		
		ArrayList<Object> valueColl = new ArrayList<>();
		System.out.println("Is the collection empty: " +valueColl.isEmpty());
		
		valueColl.add("name");
		valueColl.add(10);
		valueColl.add(false);
		valueColl.add(20.00);
		valueColl.add(null);
		
		System.out.println(valueColl); 
		
		boolean result = valueColl.contains(10);
		System.out.println("Does the collection have value 10: " + result); 
		
		System.out.println("Is the collection empty: " +valueColl.isEmpty());
		
		valueColl.remove(20.00);
		System.out.println(valueColl);
			
	}

}
