package com.xworkz.functionalinterfaceconcept;

@FunctionalInterface
public interface Vegetable {
	
	void growing();
	
	default void Food() {
		System.out.println("Vegetable are consumed by humans or other animals as food");
		
	}

}
