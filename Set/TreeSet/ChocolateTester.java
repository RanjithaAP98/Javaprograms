package com.xworkz.collectionconcept.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ChocolateTester {

	public static void main(String[] args) {
		
		Comparator<Chocolate> comp = (o1, o2)-> o1.getName().compareTo(o2.getName());
		
		TreeSet<Chocolate> chocolate = new TreeSet<Chocolate>(comp); 
		
		chocolate.add(new Chocolate("Cadbury", "Dark", "Very Nutritious"));
		chocolate.add(new Chocolate("Hershey's kisses", "White", "Improve Blood Flow"));
		chocolate.add(new Chocolate("Kit-Kat", "Milk", "Source of Antioxidants"));
		chocolate.add(new Chocolate("Bournville", "Black", "Reduce Heart Disease"));
		
		System.out.println(chocolate);
		
		//Traversing using forEach()
		System.out.println();
		System.out.println("Traversing using forEach()method:  ");
		chocolate.forEach( (c) -> System.out.println(c) ); //Lambda Expression
												
		//Traversing using Iterator
		System.out.println();
		System.out.println("Traversing using iterator: ");
		Iterator<Chocolate> cItr = chocolate.iterator();
			while(cItr.hasNext())
					System.out.println(cItr.next());

	}

}
