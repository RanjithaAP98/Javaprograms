package com.xworkz.collectionconcept;

import java.util.ArrayList;

public class ALmethods {

	public static void main(String[] args) {
		
		ArrayList<String> fruit = new ArrayList<String>();   //Creating arraylist    
		 
		//Adding object in arraylist -->(add)
	    fruit.add("Mango");   
	    fruit.add("Apple");    
	    fruit.add("Banana");    
	    fruit.add("Grapes"); 
	    fruit.add("Kiwi"); 
	    fruit.add("Orange"); 
	    fruit.add("Cherry");
	    fruit.add("Watermelon");
	    
	    fruit.add(6, "Guava");
	    
	    System.out.println();
	    System.out.println("The Fruits ArratList : " +fruit);  //Printing the arraylist object 
	    
	    
	    //check if array is empty --(isEmpty())
	    System.out.println();
	    System.out.println("Is an array is empty: " +fruit.isEmpty()); 
	    
	    
	    //size of the arraylist -->(size)
	    System.out.println();
	    System.out.println("The Size of the array: "+fruit.size()); //check the size
	    
	 
	  //search an element -->(contains)
	    boolean result = fruit.contains("Grapes"); 
	    System.out.println();
		System.out.println("Does the FriutArray have value Grapes: " + result);
		
		boolean result1 = fruit.contains("Papaya");
		System.out.println();
		System.out.println("Does the FriutArray have value Papaya: " + result1);
		
		
		//changing element --> (set)
		fruit.set(5, "Papaya");
		System.out.println();
		System.out.println("Updated ArrayList :" +fruit);
		
		
		// Sort arraylist -->(sort)
		fruit.sort(null);
		System.out.println();
		System.out.println("Sorted ArrayList :" +fruit);
		
		
		//get index -->get(index)
		System.out.println();
		System.out.println("The element at index 4 is : " +fruit.get(4));
		
		
		//set(index,element)
		fruit.set(2, "Dates");
		System.out.println();
		System.out.println("Sets the value at index 2 to the new value is : " +fruit);
		
		
		//indexOF()
		System.out.println();
		System.out.println("Index of Watermelon:" + fruit.indexOf("Watermelon"));
		 
		
		//lastindexOF()
		System.out.println();
		System.out.println("Last Index of Mango:" + fruit.lastIndexOf("Mango"));
		
				
		//remove -->(remove)
		fruit.remove("Kiwi");  //remove an element
		System.out.println();
		System.out.println("Removing an element Kiwi: "+fruit);
		
		
		fruit.remove(6); //Remove an element at index 6
		System.out.println();
		System.out.println("Removing an element at index 6: "+fruit);

	}

}
