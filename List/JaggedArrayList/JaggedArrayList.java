package com.xworkz.collectionconcept.jaggedarrayexample;

import java.util.ArrayList;

public class JaggedArrayList {
	
	public static void main(String[] args) {
		
		//Jagged array is array of arrays such that member arrays can be of different sizes, 
		// i.e., we can create a 2-D arrays but with variable number of columns in each row. 
		//These type of arrays are  known as Jagged arrays.
		
		 int n = 5; 
		  
	     ArrayList<Integer>[] al = new ArrayList[n]; 
	  
	        
	       for (int i = 0; i < n; i++) { // initializing 
	            al[i] = new ArrayList<Integer>(); 
	        } 
	  
	        al[0].add(1); 
	        al[0].add(2); 
	        al[1].add(5); 
	        al[2].add(10); 
	        al[2].add(20); 
	        al[2].add(30); 
	        al[3].add(56); 
	        al[4].add(34); 
	        al[4].add(67); 
	        al[4].add(89); 
	        al[4].add(12); 
	  
	        for (int i = 0; i < n; i++) { 
	            for (int j = 0; j < al[i].size(); j++) { 
	                System.out.print(al[i].get(j) + " "); 
	            } 
	            System.out.println(); 
	        } 
	}

}
 // 	Output :

//		1 2 
//		5 
//		10 20 30 
//		56 
//		34 67 89 12 