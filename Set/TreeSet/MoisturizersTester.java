package com.xworkz.collectionconcept.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class MoisturizersTester {
	
	public static void main(String[] args) {
		
		Comparator<Moisturizer> comp = (o1, o2)-> o1.getPrice() - o2.getPrice();
		
		TreeSet<Moisturizer> moisturizer = new TreeSet<Moisturizer>(comp);  
		
		moisturizer.add(new Moisturizer("Nivea Soft Light", "Cream", 278)); 
		moisturizer.add(new Moisturizer("Himalaya", "Gel", 250)); 
		moisturizer.add(new Moisturizer("Dove", "Liquid", 350)); 
		moisturizer.add(new Moisturizer("Lotus Herbals", "Cream", 185)); 
		moisturizer.add(new Moisturizer("Vaseline", "Liquid", 150)); 
				
		System.out.println("moisturizer: " + moisturizer);
										
		//Traversing using Iterator
		System.out.println();
		System.out.println("Traversing using iterator: ");
		Iterator<Moisturizer> mItr = moisturizer.iterator();
			while(mItr.hasNext())
					System.out.println(mItr.next());
			
		//Methods
			
		 System.out.println();
		 
		 System.out.println("first(): "+moisturizer.first());
         
         	System.out.println("last(): "+moisturizer.last());  
        
         	System.out.println("pollFirst(): " +moisturizer.pollFirst());
         
 		 System.out.println("pollLast(): " +moisturizer.pollLast());
 		 
 		 System.out.println(moisturizer);
 		 	
	}

}
