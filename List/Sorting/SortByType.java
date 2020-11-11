package com.xworkz.collectionconcept.sorting;

import java.util.Comparator;

public class SortByType implements Comparator<Television> {

	@Override
	public int compare(Television o1, Television o2) {
		
		return o2.getType().compareTo(o1.getType());
	}

}
