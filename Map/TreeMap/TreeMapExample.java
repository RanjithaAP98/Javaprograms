package com.xworkz.map;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> monthAndNumOfDays = new  TreeMap<String, Integer>();
		
		monthAndNumOfDays.put("January",31);
		monthAndNumOfDays.put("February",28 );
		monthAndNumOfDays.put("March",31);
		monthAndNumOfDays.put("April",30);
		monthAndNumOfDays.put("May",31);
		monthAndNumOfDays.put("June",30);
		monthAndNumOfDays.put("July",31);
		monthAndNumOfDays.put("August",31);
		monthAndNumOfDays.put("September",30);
		monthAndNumOfDays.put("October",31 );
		monthAndNumOfDays.put("November",30);
		monthAndNumOfDays.put("December",31); 
		
		System.out.println(monthAndNumOfDays);
		
		//Traversing Map
		
		//Traversing 1 :
		System.out.println();
		System.out.println("Traversing Map:");
		Set<String> keyset = monthAndNumOfDays.keySet();
				
		for(String i : keyset) {
			System.out.println("key : " + i + " === value : " + monthAndNumOfDays.get(i));
		}
					
		//Traversing 2 :
		System.out.println();
		
		System.out.println("Traversing using entrySet() method:");	
		Set<Entry<String,Integer>> entry = monthAndNumOfDays.entrySet();
				
		for(Entry<String,Integer> e : entry) {
			System.out.println("My key: "+ e.getKey() + " Value: "+ e.getValue());
		}
				
		//Traversing 3 :
		System.out.println();
		
		System.out.println("Traversing using forEach() method:");		
		monthAndNumOfDays.forEach((k,v) -> System.out.println("key: "+ k + " Value: "+ v)); //void accept(T t, X x);
				
		}
}
