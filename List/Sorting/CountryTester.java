package com.xworkz.collectionconcept.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountryTester {

	public static void main(String[] args) {
		
		Country c1 = new Country(25, "Canada", "CA +01");
		Country c2 = new Country(50, "Russia", "Rus +81");
		Country c3 = new Country(15, "Germany", "Ger +71");
		Country c4 = new Country(35, "America", "Ame +51");
		Country c5 = new Country(29, "India", "Ina +91");
		
		ArrayList<Country> country = new ArrayList<Country>();
		
		country.add(c1);
		country.add(c2);
		country.add(c3);
		country.add(c4);
		country.add(c5);
				
		System.out.println("Traversing using forEach():");
		country.forEach((c)->System.out.println(c));
		
		//Sorting 
		Collections.sort(country);
		System.out.println();
		System.out.println(country);
	
	}

}
