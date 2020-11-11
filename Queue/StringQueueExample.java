package com.xworkz.collectionconcept.queue;

import java.util.PriorityQueue;

public class StringQueueExample {

	public static void main(String[] args) {
		
		PriorityQueue<String> numbers = new PriorityQueue<String>(); 
		
		numbers.add("one");  
		numbers.add("two");  
		numbers.add("three");  
		numbers.add("four");  
		numbers.add("five"); 
	//	numbers.add(null); --> Queue does not allow null
		
		numbers.add("four"); //Duplicates are allowed
		
		System.out.println(numbers);
		
		System.out.println();
        System.out.println("Traversing using enhanced for each() loop: ");
		for(String str : numbers) {
			System.out.println(str);
		}
		
		//peek(): This method returns null if the Queue is empty.
		System.out.println();
		System.out.println("peek of first element:" + numbers.peek()); 
		
		//offer(object): This is same as add() method.
		numbers.offer("six");
		System.out.println();
		System.out.println(numbers); 
		
		// element(): This method returns the head (the first element) of the Queue.
		System.out.println();
		System.out.println("element of numbers:" +numbers.element());
		System.out.println(numbers); 
		
		System.out.println();
		System.out.println("poll of first element:" + numbers.poll());
		System.out.println(numbers); 
		
		//remove(): This method removes the head(first element) of the Queue.
		numbers.remove(); 
		System.out.println();
		System.out.println(numbers); 
		
		numbers.remove("six"); // remove -> index or object 
		System.out.println();
		System.out.println(numbers); 
			
	}

}
