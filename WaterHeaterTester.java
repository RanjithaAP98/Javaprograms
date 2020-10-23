package com.xworkz.functionalinterfaceconcept;

public class WaterHeaterTester {

	public static void main(String[] args) {
		
		WaterHeater  waterHeater  = (Watts)-> {
				System.out.println("The WaterHeater Power Consumption is : " + Watts + "watts");
			};
			
			waterHeater.PowerConsumption(1500);
			waterHeater.Function();
			waterHeater.PurposeOfUsage();
			
	}

}
