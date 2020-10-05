package com.xworkz.methodoverloading;

public class AdditionTester {
	public static void main(String args[]) {
		
		AdditionOperation ao = new AdditionOperation();
	      int a=10; int b=20;
	      int result=ao.add(a,b);
	      System.out.println("The result of adding 2 digits " + a +", "+ b + " : " + result);

	      double x=23.01, y=21.909;  
	      double result1=ao.add(x,y);
	      System.out.println("The result of adding 2 digits "+ x +", "+ y + " : " + result1);
	    
	      int a1=1, b1=2,c1=3;
	      int result2=ao.add(a1,b1,c1);
	      System.out.println("The result of adding 2 digits "+ a1 +", "+ b + "," + c1 +" : " + result);

	      int k=123324555, l=24566668,n=39854456;
	      int result3=ao.add(k,l,n);
	      System.out.println("The result of adding 2 digits "+ k +", "+ l+ "," + n +" : " + result3);	
	      
	      ao.add(10,20);
	      ao.add(3.55, 2.02);
	      
		}
}
