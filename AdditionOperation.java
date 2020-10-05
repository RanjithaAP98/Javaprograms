package com.xworkz.methodoverloading;

public class AdditionOperation {
	
	// add 2 int numbers
	public int add(int a, int b) {     
		int sum=a+b;
		return sum; }
	
	// add 2 double numbers
	public double add(double x, double y) {     
		double sum=x+y;
		return sum; }
	
	// add 3 int numbers
	public int add(int a1, int b1,int c1) {     
		int sum=a1+b1+c1;
		return sum; }
	
	// add 3 long numbers
		public long add(long k, long l,long m) {     
			 long sum =k+l+m;
			return sum; }	
}