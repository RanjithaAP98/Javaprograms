package com.xworkz.collectionconcept;

import java.util.ArrayList;

public class ClockTester {
	
	public static void main(String[] args) {
		
		Clock c1 =  new Clock("Ajantha", 300, "Black");
		Clock c2 =  new Clock("Casio", 400, "White");
		Clock c3 =  new Clock("Sonic", 500, "Gray");
		Clock c4 =  new Clock("Opal", 600, "Blue");
		Clock c5 =  new Clock("Fastrack", 700, "Red");
		Clock c6 =  new Clock("LG", 800, "Green");
		
		ArrayList<Clock> clock = new ArrayList<Clock>();
		
		clock.add(c1);
		clock.add(c2);
		clock.add(c3);
		clock.add(c4);
		
		System.out.println(clock);
		
		System.out.println();
		System.out.println("Traversing using for:");
		for(int i=0; i<clock.size(); i++) {
			Clock c = clock.get(i);
			System.out.println(c);
		}
		
		System.out.println();
		System.out.println("Traversing using enhanced for:");
		for(Clock c : clock) {
			System.out.println(c);
		}
		
		System.out.println();
		System.out.println("Traversing using forEach():");
		clock.forEach((c)->System.out.println(c));
		
		System.out.println();
		System.out.println("display last element: ");
		System.out.println(clock.get(clock.size()-1));
		
		System.out.println();
		System.out.println("update 3rd element with new element ");
		clock.set(3, c5);
		System.out.println(clock);
		
		System.out.println();
		System.out.println("update 0th element with new element ");
		clock.set(0,c6);
		System.out.println(clock);
					
	}

}
