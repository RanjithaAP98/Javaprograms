package com.xworkz.collectionconcept.set;

import java.util.Iterator;
import java.util.TreeSet;

public class IntegerTreeSet {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> fibonaccinumber = new TreeSet<Integer>();  
		
		fibonaccinumber.add(3);  // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,...
		fibonaccinumber.add(0);  
		fibonaccinumber.add(8);
		fibonaccinumber.add(13);
		fibonaccinumber.add(1);
		fibonaccinumber.add(5);
		fibonaccinumber.add(2);
		
		System.out.println("fibonaccinumber: " + fibonaccinumber);
										
		//Traversing using Iterator
		System.out.println();
		System.out.println("Traversing using iterator: ");
		Iterator<Integer> tItr = fibonaccinumber.iterator();
			while(tItr.hasNext())
					System.out.println(tItr.next());
			
		//Methods
			
		 System.out.println();
		 
		 System.out.println("Ceiling value for 10: " + fibonaccinumber.ceiling(10)); 
		 
		 System.out.println("Floor value for 10: "+fibonaccinumber.floor(10));
		 
         System.out.println("first(): "+fibonaccinumber.first());
         
         System.out.println("last(): "+fibonaccinumber.last());  
        
         System.out.println("pollFirst(): " +fibonaccinumber.pollFirst());
         
 		 System.out.println("pollLast(): " +fibonaccinumber.pollLast());
 		 
 		 System.out.println(fibonaccinumber);
 		 	
	}

}

//The ceiling() method returns the least element in this set greater than or equal to the given element, or null if there is no such element.


//The floor() method returns the greatest element in this set less than or equal to the given element, or null if there is no such element.