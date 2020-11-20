package com.xworkz.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class TraversingMap {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> pincodes = new  LinkedHashMap<Integer,String>(); //Creating LinkedHashMap
		
		pincodes.put(572201, "Tiptur");  //Adding elements to LinkedHashMap
		pincodes.put(573224, "Tumkur");
		pincodes.put(560001, "Hasan");
		pincodes.put(563431, "Shivamogha");
		pincodes.put(572225, "Mysore");
		
		System.out.println(pincodes);
		
		//Traversing Map
		
		//Traversing 1 :
		System.out.println();
		System.out.println("Traversing Map");
		Set<Integer> keyset = pincodes.keySet();
		
		for(Integer i : keyset) {
			System.out.println("key : " + i + " value " + pincodes.get(i));
		}
		
		System.out.println();
		System.out.println("Values in the map are: ");
		Collection<String> values = pincodes.values();
		for(String i : values) {
			System.out.println(i);
		}
		
		//Traversing 2 :
		System.out.println();
		
		Set<Entry<Integer,String>> entry = pincodes.entrySet();
		
		for(Entry<Integer,String> e : entry) {
			System.out.println("My key: "+ e.getKey() + " My value: "+ e.getValue());
		}
		
		//Traversing 3 :
		System.out.println();
		
		pincodes.forEach((k,v) -> System.out.println("key: "+ k + " Value: "+ v)); //void accept(T t, X x);
		
	}

}
