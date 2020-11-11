package com.xworkz.collectionconcept.queue;

import java.util.PriorityQueue;

public class DoubleQueueExample {

	public static void main(String[] args) {
		
		PriorityQueue<Double> dqueue = new PriorityQueue<Double>(); 
		
		dqueue.add(10.00);
		dqueue.add(5.10);
		dqueue.add(8.40);
		dqueue.add(28.00);
		dqueue.add(38.00);
		dqueue.add(40.00);
		dqueue.add(25.00);
		dqueue.add(15.50);
		dqueue.add(50.00);
		dqueue.add(26.08);
		
		System.out.println(dqueue);
		
		System.out.println();
        System.out.println("Traversing using enhanced for each() loop: ");
		for(double dq : dqueue) {
			System.out.println(dq);
		}
		
		//peek(): This method returns null if the Queue is empty.
		System.out.println();
		System.out.println("peek of first element:" + dqueue.peek()); 
		
		//offer(object): This is same as add() method.
		dqueue.offer(20.00);
		System.out.println();
		System.out.println(dqueue); 
		
		// element(): This method returns the head (the first element) of the Queue.
		System.out.println();
		System.out.println("element of dqueue :" + dqueue.element());
		System.out.println(dqueue); 
		
		System.out.println();
		System.out.println("poll of first element:" + dqueue.poll());
		System.out.println(dqueue); 
		
		//remove(): This method removes the head(first element) of the Queue.
		dqueue.remove(); 
		System.out.println();
		System.out.println(dqueue); 
		
		dqueue.remove(35.00); // remove -> index or object 
		System.out.println();
		System.out.println(dqueue); 
		
	}

}
