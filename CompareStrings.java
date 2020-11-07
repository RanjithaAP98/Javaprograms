package com.xworkz.stringconcepts;

public class CompareStrings {
	
	public static void main(String[] args) {
		
		System.out.println("Type I");
		String str1 = "Ranju";
		String str2 = "Ranju";//Refers to same location and value
		
		boolean res = str1.equals(str2);
		System.out.println("result of str1.equals(str2) : " + res);
		
		
		System.out.println();
		System.out.println("Type II"); 
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		String s3 = new String("hello"); //Compares values
		System.out.println("Result of s1.equals(s2) : " +s1.equals(s2));
		System.out.println("Result of s1.equals(s3) : " +s1.equals(s3));
		
		
		System.out.println();
		System.out.println("Type III");//Considers Memory Location
		System.out.println("is (s1==s2) : " + (s1==s2));
		
		
		System.out.println();
		System.out.println("Type IV");
		String n = "A";
		String m = "B";
		System.out.println("Comparing m and n : " + m.compareTo(n));
		
		
		System.out.println();
		System.out.println("Type V");
		String a = "Ranjitha";
		String b = "Ranju";
		System.out.println("Characters are equal : " + (a.charAt(0)==b.charAt(0)) );
		System.out.println("Characters are equal : " + (a.charAt(4)==b.charAt(4)) );
	}

}
