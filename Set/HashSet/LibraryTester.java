package com.xworkz.collectionconcept.set;

import java.util.HashSet;
import java.util.Iterator;

public class LibraryTester {

	public static void main(String[] args) {
		
		HashSet<Library> library = new HashSet<Library>(); //Creating HashSet 
		
		library.add(new Library(102, "Data Communications"));
		library.add(new Library(103, "Operating System"));
		library.add(new Library(101, "Let us C"));
		
		System.out.println(library);
		
		//Traversing using forEach()
		System.out.println();
		System.out.println("Traversing using forEach()method:  ");
		library.forEach( (l) -> System.out.println(l) ); //Lambda Expression
						
		//Traversing using Iterator
		System.out.println();
		System.out.println("Traversing using iterator: ");
		Iterator<Library> lItr = library.iterator();
			while(lItr.hasNext())
				System.out.println(lItr.next());		

	}

}
