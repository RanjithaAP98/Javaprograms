package com.xworkz.collectionconcept.set;

import java.util.HashSet;
import java.util.Iterator;

public class StringHashSet {

	public static void main(String[] args) {
		
		HashSet<String> wdays = new HashSet<String>(); //Creating HashSet 
		
		wdays.add("Sunday"); //Adding elements -> HashSet doesn't maintain the insertion order  
		wdays.add("Monday");
		wdays.add("Tuesday");
		wdays.add("Wednesday");
		wdays.add("Thursday");
		wdays.add("Friday");
		wdays.add("Saturday");
		
		wdays.add("Sunday"); //doesnt allow duplicate(it contains unique elements only.)
		wdays.add(null); //HashSet allows null value.
		
		System.out.println(wdays);
		
		//Traversing using forEach()
		System.out.println();
		System.out.println("Traversing using forEach()method:  ");
		wdays.forEach( (wd) -> System.out.println(wd) ); //Lambda Expression
				
		//Traversing using Iterator
		System.out.println();
		System.out.println("Traversing using iterator: ");
		Iterator<String> wdItr = wdays.iterator();
			while(wdItr.hasNext())
					System.out.println(wdItr.next());	
	}

}
