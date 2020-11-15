package com.xworkz.collectionconcept.set;

import java.util.Iterator;
import java.util.TreeSet;

public class StringTreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> tree =new TreeSet<String>();  
		
		tree.add("Banyan");
		tree.add("Neem");
		tree.add("Mango Tree");
		tree.add("Coconut");
		tree.add("Banana Tree");
		
		System.out.println(tree);
		
		//Traversing using forEach()
		System.out.println();
		System.out.println("Traversing using forEach()method:  ");
		tree.forEach( (t) -> System.out.println(t) ); //Lambda Expression
										
		//Traversing using Iterator
		System.out.println();
		System.out.println("Traversing using iterator: ");
		Iterator<String> tItr = tree.iterator();
			while(tItr.hasNext())
					System.out.println(tItr.next());
			
		//Methods
			
		 System.out.println();	
		 		
		 System.out.println("size(): "+tree.size());
		 
		 System.out.println("contains(Object o): " +tree.contains("Coconut"));
		 
		 System.out.println("hashCode(): "+tree.hashCode());  // It returns an integer value which is the hashCode value for instance of the TreeSet.
		
		 System.out.println("Initial Set: "+tree);  
         	 System.out.println("Reverse Set: "+tree.descendingSet());  
         
         	 System.out.println("first(): "+tree.first());
        	 System.out.println("last(): "+tree.last());
           
       		 System.out.println("Head Set: "+tree.headSet("Mango Tree", true));    
         	 System.out.println("TailSet: "+tree.tailSet("Coconut", false));
         
        	 System.out.println("toString(): "+tree.toString());
        
        	 System.out.println("pollFirst(): " +tree.pollFirst());
 		 System.out.println("pollLast(): " +tree.pollLast());
 		 
 		 System.out.println("remove(): " +tree.remove("Mango Tree"));
 		
 		 System.out.println(tree);
 		 	
	}

}
