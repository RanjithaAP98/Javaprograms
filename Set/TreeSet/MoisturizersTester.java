package com.xworkz.collectionconcept.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class MoisturizersTester {
	
	public static void main(String[] args) {
		
		Moisturizer m1 = new Moisturizer("Nivea Soft Light", "Cream", 278);
		Moisturizer m2 = new Moisturizer("Himalaya", "Gel", 250);
		Moisturizer m3 = new Moisturizer("Dove", "Liquid", 350);
		Moisturizer m4 = new Moisturizer("Lotus Herbals", "Cream", 185);
		Moisturizer m5 = new Moisturizer("Vaseline", "Liquid", 150);
		
		Comparator<Moisturizer> comp = (o1, o2)-> o1.getPrice() - o2.getPrice();
		
		TreeSet<Moisturizer> moisturizer = new TreeSet<Moisturizer>(comp);  
		
		moisturizer.add(m1); 
		moisturizer.add(m2); 
		moisturizer.add(m3); 
		moisturizer.add(m4); 
		moisturizer.add(m5); 
				
		System.out.println("moisturizer: " + moisturizer);
										
		//Traversing using Iterator
		System.out.println();
		System.out.println("Traversing using iterator: ");
		Iterator<Moisturizer> mItr = moisturizer.iterator();
			while(mItr.hasNext())
					System.out.println(mItr.next());
			
		//Methods
			
		 System.out.println();
		 
		 System.out.println("floor(m1): "+moisturizer.floor(m1));
		 
		 System.out.println("ceiling(m2): "+moisturizer.ceiling(m2));
		 
		 System.out.println("first(): "+moisturizer.first());
         
         	 System.out.println("last(): "+moisturizer.last());  
        
         	 System.out.println("pollFirst(): " +moisturizer.pollFirst());
         
 		 System.out.println("pollLast(): " +moisturizer.pollLast());
 		 
 		 System.out.println(moisturizer);
 		 	
	}

}
