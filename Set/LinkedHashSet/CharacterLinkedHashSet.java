package com.xworkz.collectionconcept.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CharacterLinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Character> character = new LinkedHashSet<Character>();
		
		character.add('A');
		character.add('B');
		character.add('C');
		character.add('D');
		character.add('E');
		
		System.out.println(character);
		
		//Traversing using forEach()
		System.out.println();
		System.out.println("Traversing using forEach()method:  ");
		character.forEach( (c) -> System.out.println(c) ); //Lambda Expression
						
		//Traversing using Iterator
		System.out.println();
		System.out.println("Traversing using iterator: ");
		Iterator<Character> cItr = character.iterator();
			while(cItr.hasNext())
					System.out.println(cItr.next());
		
	}

}
