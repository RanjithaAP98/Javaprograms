package com.xworkz.arrayexample;

public class BooleanExample {
		public static void main(String[] args) {
			
			boolean [] fruits;
			fruits =  new boolean[5];
			
			fruits[0] =true; //FruitRipeTest
			fruits[1] =false;
			fruits[2] =false;
			fruits[3] =true;
			fruits[4] =true;
			
			System.out.println("java boolean array examples");
			for (int i=0; i<fruits.length; i++)
			{
				System.out.println("The fruit : " + i +" is " + fruits[i] );
			}
			
		}
}
