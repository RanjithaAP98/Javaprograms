package com.xworkz.collectionconcept.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class SanitizerTester {

	public static void main(String[] args) {
		
		Sanitizer s1 = new Sanitizer("Himalaya", 50,"gel");
		Sanitizer s2 = new Sanitizer("Lifebuoy", 30,"liquid");
		Sanitizer s3 = new Sanitizer("Dettol", 100,"foam");
		Sanitizer s4 = new Sanitizer("Savlon", 150,"gel");
		Sanitizer s5 = new Sanitizer("Kaya", 250,"liquid");
		
		PriorityQueue<Sanitizer> sanitizer = new PriorityQueue<Sanitizer>(5,new SortSanitizerByPrice());
		
		sanitizer.add(s1);
		sanitizer.add(s2);
		sanitizer.add(s3);
		sanitizer.add(s4);
		
	    System.out.println(sanitizer);
	    
	    
	    //Traversing book elements using Iterator
	    System.out.println();
		System.out.println("Traversing using iterator: ");
		Iterator<Sanitizer> Itr =  sanitizer.iterator();
		while(Itr.hasNext())
			System.out.println(Itr.next());
		
		//offer() method
		sanitizer.offer(s5);
		System.out.println();
		System.out.println(sanitizer);
		
		//element() method
		System.out.println();
		System.out.println("element of book:" +sanitizer.element());
		
		//peek() method
		System.out.println();
		System.out.println("peek of first element:" + sanitizer.peek()); 
		
		//poll() method
		System.out.println();
		System.out.println("poll of first element:" + sanitizer.poll());
		System.out.println(sanitizer); 
		
		//Remove
		sanitizer.remove();
		System.out.println();
		System.out.println(sanitizer);	

	}

}
