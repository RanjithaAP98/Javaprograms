package com.xworkz.stringconcepts;

public class CountChars {
	
public static void main(String[] args) {
		
		String str = "hheeeeellllloooo" ;
		char c = 'e';
		System.out.println("Number of times Character "+ c + " is repeated : " + count(str,c));
		
	}
	
	public static int count(String str , char c) {
		int result = 0;
		for(int i = 0; i<  str.length() ; i++) {
			if (str.charAt(i) == c)
				result++;
		}
		return result;
	}	
}

