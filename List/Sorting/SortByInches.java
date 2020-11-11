package com.xworkz.collectionconcept.sorting;

import java.util.Comparator;

public class SortByInches implements Comparator<Television>  {

	@Override
	public int compare(Television o1, Television o2) {
		
		return o1.getInches() - o2.getInches();
	}

}
