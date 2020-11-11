package com.xworkz.collectionconcept;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.ListIterator;

public class StringAL {

	public static void main(String[] args) {
			
		ArrayList<String> pLanguages = new ArrayList<String>();
		
		pLanguages.add("C");
		pLanguages.add("C++");
        pLanguages.add("Java");
        pLanguages.add("Html");
        pLanguages.add("Python");
        pLanguages.add("Perl");
        pLanguages.add("Ruby");
        
        System.out.println();
        System.out.println("Traversing using enhanced for loop: ");
		for(String str : pLanguages) {
			System.out.println(str);
		}
		
		System.out.println();
		Iterator<String> itr = pLanguages.iterator();
		System.out.println("Traversing using Iterator: ");
		while(itr.hasNext()) 
			System.out.println(itr.next());
		
		System.out.println();
		ListIterator<String> lItr = pLanguages.listIterator();
		System.out.println("Traversing forward direction using listIterator: ");
		while(lItr.hasNext())
			System.out.println(lItr.next());
		
		System.out.println();
		System.out.println("Traversing backward direction using listIterator: ");
		while(lItr.hasPrevious())
			System.out.println(lItr.previous());
		
	}

}
