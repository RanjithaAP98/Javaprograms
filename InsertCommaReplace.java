package com.xworkz.stringconcepts;

public class InsertCommaReplace {
	
	public static void main(String[] args) {
		
		String str = "Welcome to xworkz and you are learning string methods in java";
		//String[] str = s.split(" ");
		
		String s = str.replace(' ' , ',');
		
		System.out.println(s);	
	}
}

