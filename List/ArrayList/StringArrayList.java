package com.xworkz.collectionconcept;

import java.util.ArrayList;

public class StringArrayList {
	
	public static void main(String[] args) {
	
	ArrayList<String> list = new ArrayList<String>();   //Creating arraylist    
	
    list.add("Mango");   //Adding object in arraylist    
    list.add("Apple");    
    list.add("Banana");    
    list.add("Grapes"); 
    list.add("Kiwi"); 
    list.add("Orange"); 
      
    System.out.println("Fruits: " +list);  //Printing the arraylist object  
    
    System.out.println("Size of the array: "+list.size()); //check the size
    
    System.out.println("Is the array empty: " +list.isEmpty()); //check if array is empty
    
    boolean result = list.contains("Grapes"); //search an element
	System.out.println("Does the FriutArray have value Grapes: " + result);
	
	boolean result1 = list.contains("Papaya");
	System.out.println("Does the FriutArray have value Papaya: " + result1);
	
	list.remove("Kiwi"); //remove an element
	System.out.println(list);
	
    
   }  

}
