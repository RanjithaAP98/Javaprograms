package com.xworkz.arrayexample;

public class DoubleExample {

		public static void main(String[] args) {
			
			double [] price;
			price = new double[5];
			
			price[0]= 82.56; // Petrol price
			price[1]=85.12;
			price[2]=86.25;
			price[3]=81.55;
			price[4]=84.25;
			
			System.out.println("Hiking of petrol for 5 concecutive days");
			
			for(int i=0; i<price.length; i++)
			{
				System.out.println("The price of day " +i +" is "+price[i]);
			}
		}
}
