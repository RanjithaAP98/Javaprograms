package com.xworkz.collectionconcept.queue;

import java.util.Comparator;

public class SortSanitizerByPrice implements Comparator<Sanitizer>  {

	@Override
	public int compare(Sanitizer o1, Sanitizer o2) {
		
		return o1.getPrice() - o2.getPrice();
	}

}
