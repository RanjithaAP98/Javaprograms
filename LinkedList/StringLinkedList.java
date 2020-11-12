package com.xworkz.collectionconcept.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class StringLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> animals = new LinkedList<String>();
		
		//add() methods
		animals.addFirst("Cow");
		animals.offerFirst("Dog");
		
		animals.add("Monkey");
		animals.add("Rat");
		animals.add("Squirrel");
		
		animals.offer("Panda");
		
		animals.offerLast("Lion");
		animals.addLast("Bear");
				
		System.out.println(animals);
		
		//Traversing using Iterator
		System.out.println();
		System.out.println("Traversing using iterator: ");
		Iterator<String> AItr = animals.iterator();
		while(AItr.hasNext())
			System.out.println(AItr.next());
		
		//Traversing using ListIterator
		System.out.println();
		ListIterator<String> ALItr = animals.listIterator();
		System.out.println("Traversing using listIterator: ");
		while(ALItr.hasNext())
			System.out.println(ALItr.next());
		
		//Retrival methods
		
		//peek()
		System.out.println();
		System.out.println("peek of first element:" + animals.peek());
		System.out.println("peekFirst():" + animals.peekFirst());
		System.out.println("peekLast():" + animals.peekLast());
		
		//element()
		System.out.println();
		System.out.println("element of animals :" + animals.element());
		
		//get()
		System.out.println();
		System.out.println("The element at index 5 is : " +animals.get(5));
		System.out.println("getFirst(): " + animals.getFirst());
		System.out.println("getLast(): " + animals.getLast());
		
		//Remove methods
		
		//remove()
		System.out.println();
		System.out.println("remove(): "+ animals.remove());
		System.out.println("remove(index): " + animals.remove(3)); //remove at index
		
		System.out.println();
		System.out.println("removeFirst(): " + animals.removeFirst());
		System.out.println("removeLast(): " +animals.removeLast());
		
		System.out.println();
		System.out.println("removeFirstOccurrence(): " +animals.removeFirstOccurrence("Monkey"));
		System.out.println("removeLastOccurrence(): " +animals.removeLastOccurrence("Lion"));
		
		System.out.println();
		System.out.println("remove(object o): "+animals.remove("Rat"));
		System.out.println(animals);
		
		//push()
		System.out.println();
		animals.push("Camel");
		animals.push("Elephant");
		animals.push("Deer");
		animals.push("Fish");
		animals.push("Rabbit");
		animals.push("Horse");
		System.out.println("push(): "+animals);
		
		//pop()
		System.out.println();
		System.out.println("pop(): " + animals.pop());
		
		//poll()
		System.out.println();
		System.out.println("poll(): " +animals.poll());
		System.out.println("pollFirst(): " + animals.pollFirst());
		System.out.println("pollLast(): " + animals.pollLast());
		System.out.println(animals);
		
		//removeAll()
		System.out.println();
		System.out.println("removeAll():" +animals.removeAll(animals)); //Removes all of this collection's elements
		System.out.println("animals: "+ animals);
		
	}

}
