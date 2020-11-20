package com.xworkz.map;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedhashmapEx {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> aadharNumber = new  LinkedHashMap<Integer,String>(); //Creating LinkedHashMap
		
		aadharNumber.put(187234506, "Gagana");
		aadharNumber.put(243217890, "Ranjitha");
		aadharNumber.put(564327890, "Anush");
		aadharNumber.put(345621099, "jenuShree");
		aadharNumber.put(152375489, "Veena");
		
		System.out.println(aadharNumber);
		
		//Traversing:
		System.out.println();
				
		Set<Entry<Integer,String>> entry = aadharNumber.entrySet();
				
		for(Entry<Integer,String> e : entry) {
				System.out.println("My key: "+ e.getKey() + " My value: "+ e.getValue());
		}	
		
	}

}
