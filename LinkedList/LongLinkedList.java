package com.xworkz.collectionconcept.linkedlist;

import java.util.LinkedList;

public class LongLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList<Long> longlist = new LinkedList<Long>(); ////Creating LinkedList    
		
		longlist.add(10L); //Adding object in LinkedList -->(add)
		longlist.add(11L);
		longlist.add(30L);  
		longlist.add(20L);
		longlist.add(40L);
		longlist.add(50L);
		longlist.add(60L);
		longlist.add(55L);
		longlist.add(26L);
		longlist.add(48L);
		longlist.add(25L);
		longlist.add(5L);
									//duplictes are allowed also alowws null
		
		System.out.println(longlist);
		
		 //size of the LinkedList -->(size)
	    System.out.println();
	    System.out.println("The Size of the LinkedList: "+longlist.size()); 
	    
	    
		System.out.println();
        System.out.println("Traversing using enhanced for each() loop: ");
		for(long lng : longlist) {
			System.out.println(lng);
		}
		
		
		//Methods from List
		
		 System.out.println();
		 System.out.println("Methods from List"); 
		
		 //check if LinkedList is empty --(isEmpty())
	    System.out.println();
	    System.out.println("Is an LongList is empty: " + longlist.isEmpty()); 
	    
	    
	    //search an element -->(contains)
	    boolean result = longlist.contains(30L); 
	    System.out.println();
		System.out.println("Does the LongList have value 30L: " + result);
		
		//changing element --> (set)
		longlist.set(4,8L);
		System.out.println();
		System.out.println("Updated LongList :" +longlist);
		
		//get index -->get(index)
		System.out.println();
		System.out.println("The element at index 11 is : " +longlist.get(11));
		
		// Sort LinkedList -->(sort)
		longlist.sort(null);
		System.out.println();
		System.out.println("Sorted LongList :" + longlist);
							 
	    //remove
		longlist.remove(6); //Remove an element at index 6
		System.out.println();
		System.out.println("Removing an element at index 6: "+longlist);
		

		//Methods from Queue
		
		System.out.println();
	    System.out.println("Methods from Queue");
		
		//peek(): This method returns null if the Queue is empty.
		System.out.println();
		System.out.println("peek of first element:" + longlist.peek());
		System.out.println("peekFirst():" + longlist.peekFirst());
		System.out.println("peekLast():" + longlist.peekLast());
		
				
		//offer(object): This is same as add() method.
		longlist.offer(26L);
		System.out.println();
		System.out.println(longlist); 
				
		//element(): This method returns the head (the first element) of the Queue.
		System.out.println();
		System.out.println("element of LongList :" + longlist.element());
		System.out.println(longlist); 
		
		//poll()
		System.out.println();
		System.out.println("poll of first element:" + longlist.poll());
		System.out.println("pollFirst():" + longlist.pollFirst());
		System.out.println("pollLast():" + longlist.pollLast());
		System.out.println(longlist); 
				
		//remove(): This method removes the head(first element) of the Queue.
		longlist.remove(); 
		System.out.println();
		System.out.println(longlist); 
		
				
		// Special methods From LinkedList
		
		System.out.println();
	    System.out.println("Methods from LinkedList");
		
		//push(): add element to 1st position
		longlist.push(35L);
		System.out.println();
		System.out.println("Push(): " + longlist);
		
		//pop():  removes the first element of this list. 
		longlist.pop();
		System.out.println();
		System.out.println("Pop(): " + longlist);
		
		
	}

}
