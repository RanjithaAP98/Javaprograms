package com.xworkz.collectionconcept.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MushroomTester {
	
	public static void main(String[] args) {
	
		Mushroom m1 = new Mushroom("White-Button mushroom", true, "low in calories");
		Mushroom m2 = new Mushroom("Oyster mushroom", true, "fat-free");
		Mushroom m3 = new Mushroom("Enoki mushroom", true, "cholestrio-free");
		Mushroom m4 = new Mushroom("Beech mushroom", true, "gluten-free");
		Mushroom m5 = new Mushroom("Black-Trumpet mushroom", false, "very low sodium");
		Mushroom m6 = new Mushroom("Spong mushroom", true, "very low sodium");
	
		LinkedList<Mushroom> mushroom = new LinkedList<Mushroom>();
		
		mushroom.add(m1);
		mushroom.add(m2);
		mushroom.add(m3);
		mushroom.add(m4);
		mushroom.add(m5);
		
		System.out.println(mushroom);
		
		//Traversing using forEach()
		System.out.println();
		System.out.println("Traversing using forEach(): ");
		mushroom.forEach( (m) -> System.out.println(m) ); //Lambda Expression
		
//		mushroom.forEach(new Consumer<Mushroom>() {
//			
//			@Override
//			public void accept(Mushroom mushroom) {
//				System.out.println(mushroom);	
//			}		
//	});
		
		//Traversing using Iterator
		System.out.println();
		System.out.println("Traversing using iterator: ");
		Iterator<Mushroom> mItr = mushroom.iterator();
		while(mItr.hasNext())
			System.out.println(mItr.next());
		
		//Traversing using ListIterator
		System.out.println();
		ListIterator<Mushroom> mLItr = mushroom.listIterator();
		System.out.println("Traversing forward direction using listIterator: ");
		while(mLItr.hasNext())
			System.out.println(mLItr.next());
		
		System.out.println();
		System.out.println("Traversing backward direction using listIterator: ");
		while(mLItr.hasPrevious())
			System.out.println(mLItr.previous());
		
		//push()
		System.out.println();
		mushroom.push(m6);
		System.out.println(mushroom);
		
		//pop()
		System.out.println();
		System.out.println("pop():" + mushroom.pop());
		System.out.println(mushroom);
		
		//poll()
		System.out.println();
		System.out.println("poll(): "+ mushroom.poll());
		System.out.println("pollFirst(): " +mushroom.pollFirst());
		System.out.println("pollLast(): " +mushroom.pollLast());
		System.out.println(mushroom);
		
		//remove()
		System.out.println();
		System.out.println("remove(): " + mushroom.remove());
		System.out.println(mushroom);
		System.out.println("removeAll(): " +mushroom.removeAll(mushroom));
		System.out.println(mushroom);	
		
	}
}
