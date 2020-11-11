package com.xworkz.collectionconcept;

import java.util.ArrayList;

public class CharacterArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Character> vowels = new ArrayList<Character>();

		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');
		
		System.out.println();
		System.out.println(vowels.isEmpty());
		
		System.out.println();
		System.out.println("size of the array: " + vowels.size());
		
		System.out.println();
		System.out.println("Traversing using for():");
		for (int i = 0; i < vowels.size(); i++)
			System.out.println("Printing the arraylist object using for loop : " + vowels.get(i));
		
		System.out.println();
		System.out.println("Traversing using forEach():");
		for (Character i : vowels)
			System.out.println("Printing the arraylist object using for-each loop: " + i);
		
		System.out.println();
		vowels.set(0, 'Z');
		System.out.println(vowels);
		
		System.out.println();
		System.out.println(vowels.get(4));
		
		System.out.println();
		vowels.remove(2);
		System.out.println(vowels);
		
		System.out.println();
		System.out.println(vowels.contains('Z'));
		
		System.out.println();
		vowels.remove(new Character('Z'));
		System.out.println(vowels);

	}

}
