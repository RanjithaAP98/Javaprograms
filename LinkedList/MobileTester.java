package com.xworkz.collectionconcept.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class MobileTester {

	public static void main(String[] args) {
		
		Mobile m1 = new Mobile("Redmi", "Blue", 128);
		Mobile m2 = new Mobile("Samsung", "Grey", 8);
		Mobile m3 = new Mobile("Oppo", "Moon-light", 64);
		Mobile m4 = new Mobile("Vivo", "Silver", 16);
		Mobile m5 = new Mobile("Lenovo", "Aquamarine", 12);
		Mobile m6 = new Mobile("Sony", "Rosegold", 24);
		
		
		LinkedList<Mobile> mobile = new LinkedList<Mobile>(); //Creating LinkedList   
		
		mobile.add(m1);
		mobile.add(m2);
		mobile.add(m3);
		mobile.add(m5);
		
		System.out.println(mobile);
		
		//Traversing using Iterator
		System.out.println();
		System.out.println("Traversing using iterator: ");
		Iterator<Mobile> mItr = mobile.iterator();
		while(mItr.hasNext())
			System.out.println(mItr.next());
		
		//Methods from List
		
		//changing element --> (set)
		System.out.println();
		System.out.println("update 2nd element with new element ");
		mobile.set(2, m4);
		System.out.println(mobile);
		
		//displaying last element in list
		System.out.println();
		System.out.println("display last element: ");
		System.out.println(mobile.get(mobile.size()-1));
		
		//remove()
		mobile.remove(m4); 
		System.out.println();
		System.out.println("Removing an element m4 : " + mobile);
		
		//Methods from Queue
		
		//offer() method
		mobile.offer(m4);
		mobile.offer(m5);
		System.out.println();
		System.out.println(mobile);
		
		//element() method
		System.out.println();
		System.out.println("element of mobile:" +mobile.element());
		
		//peek() method
		System.out.println();
		System.out.println("peek of first element:" + mobile.peek());
		System.out.println("peekFirst():" + mobile.peekFirst());
		System.out.println("peekLast():" + mobile.peekLast());
		
		//poll() method
		System.out.println();
		System.out.println("poll of first element:" + mobile.poll());
		System.out.println("pollFirst():" +mobile.pollFirst());
		System.out.println("pollLast():" + mobile.pollLast());
		System.out.println(mobile); 
		
		
		// Special methods From LinkedList
				
		//push(): add element to 1st position
		mobile.push(m4);
		mobile.push(m6);
		System.out.println();
		System.out.println("Push(): " + mobile);
				
		//pop(): removes the first element of this list. 
		mobile.pop();
		System.out.println();
		System.out.println("Pop(): " + mobile);
						
	}

}
