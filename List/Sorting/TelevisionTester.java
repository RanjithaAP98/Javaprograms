package com.xworkz.collectionconcept.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TelevisionTester {

	public static void main(String[] args) {
		
		Television t1 = new Television("Onida", 30 , "LCD");
		Television t2 = new Television("Samsung", 45 , "LED");
		Television t3 = new Television("Sony", 32 , "OLED");
		Television t4 = new Television("Toshiba", 50 , "MicroLED");
		Television t5 = new Television("LG", 24 , "PlasmaScreen");
		
		ArrayList<Television> television = new ArrayList<Television>();
		
		television.add(t1);
		television.add(t2);
		television.add(t3);
		television.add(t4);
		television.add(t5);
		
		System.out.println("Traversing using forEach():");
		television.forEach((t)->System.out.println(t));
		
		//sorting inches in ascending order
		Collections.sort(television, new SortByInches());
		System.out.println();
		System.out.println(television); 
		
		//sorting brand in decending order
		Collections.sort(television, new SortByBrand());
		System.out.println();
		System.out.println(television); 
		
		//sorting type in decending order
		Collections.sort(television, new SortByType()); 
		System.out.println();
		System.out.println(television); 
		
	}

}
