package com.xworkz.collectionconcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class LaptopTester {

	public static void main(String[] args) {
		
		ArrayList<Laptop> laptopAL = new ArrayList<Laptop>();
		
		Laptop laptop1 = new Laptop("Lenovo", 40000 , "Gray");
		Laptop laptop2 = new Laptop("HP", 37000 , "Black");
		Laptop laptop3 = new Laptop("Acer", 35000 , "White");
		Laptop laptop4 = new Laptop("Dell", 30000 , "Silver");
		
		laptopAL.add(laptop1);
		laptopAL.add(laptop2);
		laptopAL.add(laptop3);
		laptopAL.add(laptop4);
		
		System.out.println();
		System.out.println("Traversing using enhanced for loop: ");
		for(Laptop lp : laptopAL)
			System.out.println(lp);
		
		System.out.println();
		System.out.println("Traversing using iterator: ");
		Iterator<Laptop> lpItr = laptopAL.iterator();
		while(lpItr.hasNext())
			System.out.println(lpItr.next());
		
		System.out.println();
		ListIterator<Laptop> lpLItr = laptopAL.listIterator();
		System.out.println("Traversing forward direction using listIterator: ");
		while(lpLItr.hasNext())
			System.out.println(lpLItr.next());
		
		System.out.println();
		System.out.println("Traversing backward direction using listIterator: ");
		while(lpLItr.hasPrevious())
			System.out.println(lpLItr.previous());
		
	}

}
