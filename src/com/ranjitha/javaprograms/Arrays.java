package com.ranjitha.javaprograms;

public class Arrays {

	public static void main(String[] args) {
		// Arrays are used to store multiple values in a single variable, 
		//instead of declaring separate variables for each value.
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[0]);     //Access : an array element by referring to the index number.
		System.out.println("Length of array : " +cars.length);  //To find out how many elements an array has,use the length property
		
		int[] myNum = {10, 20, 30, 40};
		System.out.println();
		System.out.println(myNum[0]);
		
		
		//For Loop Through an Array
		System.out.println();
		System.out.println("For loop display");
		String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
		for (int i = 0; i < cars1.length; i++) {
		  System.out.println(cars1[i]);
		}
		 
		//Loop Through an Array with For-Each
		System.out.println();
		System.out.println("For-each loop display");
		String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
		  System.out.println(i);
		}
		
		//Multidimensional Arrays
		System.out.println();
		System.out.println("Multidimensional array display");
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		int x = myNumbers[1][2];
		System.out.println(x);
		
		//two-dimensional array 
		System.out.println();
		int[][] myNumbers1 = { {1, 2, 3, 4}, {5, 6, 7} };
	    for (int i = 0; i < myNumbers1.length; ++i) {
	      for(int j = 0; j < myNumbers1[i].length; ++j) {
	        System.out.println(myNumbers1[i][j]);
	      }
	    }
	}
}
