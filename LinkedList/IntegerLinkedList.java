package com.xworkz.collectionconcept.linkedlist;

import java.util.LinkedList;

public class IntegerLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> armstrongnumber = new LinkedList<Integer>(); ////Creating LinkedList    
		
		armstrongnumber.add(0); //Adding object in LinkedList -->(add)
		armstrongnumber.add(1);
		armstrongnumber.add(3);  
		armstrongnumber.add(2);
		armstrongnumber.add(4);
		armstrongnumber.add(5);
		armstrongnumber.add(6);
		armstrongnumber.add(7);
		armstrongnumber.add(8);
		armstrongnumber.add(9);
		armstrongnumber.add(153);
		armstrongnumber.add(1634);
									//duplictes are allowed also alowws null
		
		System.out.println(armstrongnumber);
		
		 //size of the LinkedList -->(size)
	    System.out.println();
	    System.out.println("The Size of the LinkedList: "+armstrongnumber.size()); 
	    
	    
		System.out.println();
        System.out.println("Traversing using enhanced for each() loop: ");
		for(int an : armstrongnumber) {
			System.out.println(an);
		}
		
		
		//Methods from List
		
		 System.out.println();
		 System.out.println("Methods from List"); 
		
		 //check if LinkedList is empty --(isEmpty())
	    System.out.println();
	    System.out.println("Is an LinkedList is empty: " + armstrongnumber.isEmpty()); 
	    
	    
	    //search an element -->(contains)
	    boolean result = armstrongnumber.contains(153); 
	    System.out.println();
		System.out.println("Does the LinkedList have value 153: " + result);
		
		//changing element --> (set)
		armstrongnumber.set(10, 370);
		System.out.println();
		System.out.println("Updated LinkedList :" +armstrongnumber);
		
		//get index -->get(index)
		System.out.println();
		System.out.println("The element at index 11 is : " +armstrongnumber.get(11));
		
		// Sort LinkedList -->(sort)
		armstrongnumber.sort(null);
		System.out.println();
		System.out.println("Sorted LinkedList :" + armstrongnumber);
							 
	    //remove
		armstrongnumber.remove(6); //Remove an element at index 6
		System.out.println();
		System.out.println("Removing an element at index 6: "+armstrongnumber);
		

		//Methods from Queue
		
		System.out.println();
	    System.out.println("Methods from Queue");
		
		//peek(): This method returns null if the Queue is empty.
		System.out.println();
		System.out.println("peek of first element:" + armstrongnumber.peek());
		System.out.println("peekFirst():" + armstrongnumber.peekFirst());
		System.out.println("peekLast():" + armstrongnumber.peekLast());
		
				
		//offer(object): This is same as add() method.
		armstrongnumber.offer(407);
		System.out.println();
		System.out.println(armstrongnumber); 
				
		//element(): This method returns the head (the first element) of the Queue.
		System.out.println();
		System.out.println("element of armstrongnumber :" + armstrongnumber.element());
		System.out.println(armstrongnumber); 
		
		//poll()
		System.out.println();
		System.out.println("poll of first element:" + armstrongnumber.poll());
		System.out.println("pollFirst():" + armstrongnumber.pollFirst());
		System.out.println("pollLast():" + armstrongnumber.pollLast());
		System.out.println(armstrongnumber); 
				
		//remove(): This method removes the head(first element) of the Queue.
		armstrongnumber.remove(); 
		System.out.println();
		System.out.println(armstrongnumber); 
		
				
		// Special methods From LinkedList
		
		System.out.println();
	    System.out.println("Methods from LinkedList");
		
		//push(): add element to 1st position
		armstrongnumber.push(371);
		System.out.println();
		System.out.println("Push(): " + armstrongnumber);
		
		//pop():  removes the first element of this list. 
		armstrongnumber.pop();
		System.out.println();
		System.out.println("Pop(): " + armstrongnumber);
		
	}

}
