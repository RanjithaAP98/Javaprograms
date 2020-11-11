package com.xworkz.collectionconcept.queue;

import java.util.PriorityQueue;

public class IntegerQueueExample {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> numbers = new PriorityQueue<Integer>(); 
		
		numbers.add(6);  
		numbers.add(3);  
		numbers.add(1);  
		numbers.add(5);  
		numbers.add(4); 
	
		numbers.add(4); //Duplicates are allowed
		
		System.out.println(numbers);
		
		//peek(): (return first element)This method returns null if the Queue is empty.
		System.out.println();
		System.out.println("peek of first element:" + numbers.peek()); 
		
		//offer(object): This is same as add() method.
		numbers.offer(8);
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
		
		numbers.remove(5); // remove -> index or object 
		System.out.println();
		System.out.println(numbers); 
			
	}

}
