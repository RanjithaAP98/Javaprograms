package com.xworkz.functionalinterfaceconcept;

public class VegetableTester {

	public static void main(String[] args) {
		
		Vegetable vegetable = new Vegetable() {

			@Override
			public void growing() {
				System.out.println("Vegetables are growing");
				
			}
		};
		
		vegetable.growing();
		vegetable.Food();
		
		System.out.println();
		
		// Using Lamba Expression( -> )
		
		Vegetable vegetable1 = ()->{
			System.out.println("Vegetables are growing");
	};
	vegetable1.growing();
	vegetable1.Food();
	}
}
