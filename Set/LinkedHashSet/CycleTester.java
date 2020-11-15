package com.xworkz.collectionconcept.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CycleTester {

	public static void main(String[] args) {
		
		LinkedHashSet<Cycle> cycle = new LinkedHashSet<Cycle>();
		
		cycle.add(new Cycle("Hero Stomper" , 3200));
		cycle.add(new Cycle("Miss World" , 3500));
		cycle.add(new Cycle("Hercules" ,5000));
		cycle.add(new Cycle("Atlas" ,4500));
		
		System.out.println(cycle);
		
		//Traversing using forEach()
		System.out.println();
		System.out.println("Traversing using forEach()method:  ");
		cycle.forEach( (c) -> System.out.println(c) ); //Lambda Expression
								
		//Traversing using Iterator
		System.out.println();
		System.out.println("Traversing using iterator: ");
		Iterator<Cycle> cItr = cycle.iterator();
			while(cItr.hasNext())
					System.out.println(cItr.next());
		

	}

}
