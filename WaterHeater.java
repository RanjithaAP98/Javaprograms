package com.xworkz.functionalinterfaceconcept;

public interface WaterHeater {
	
	void PowerConsumption(int Watts);
	
	default void Function() {	
			System.out.println("Function: Use to heat water");
	}
	
	default void PurposeOfUsage () {	
		System.out.println("PurposeOfUsage : Cooking, bathing, cleaning, ....");
	}
	
	

}
