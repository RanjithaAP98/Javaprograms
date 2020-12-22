package com.ranjitha.javaprograms;

public class LoopForEach {

	public static void main(String[] args) {
		//a "for-each" loop, which is used exclusively to loop through elements in an array
		//Syntax --> for(type variableName : arrayName)
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
		  System.out.println(i);
		}

	}

}
