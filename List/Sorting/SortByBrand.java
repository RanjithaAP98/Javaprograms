package com.xworkz.collectionconcept.sorting;

import java.util.Comparator;

public class SortByBrand implements Comparator<Television> {

	@Override
	public int compare(Television o1, Television o2) {
		
		return o2.getBrand().compareTo(o1.getBrand());
	}

}
