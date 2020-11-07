package com.xworkz.stringconcepts;

public class CountVowels {
	
	public static void main(String[] args) {
		
		String str ="Welcome to Xworkz";
		System.out.println("Entered String is : " + str);
		
		int vowels = 0 ;
		str = str.toLowerCase();
		for(int i = 0; i < str.length() ; i++) {
			char c = str.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowels++;
			}
		}
		
		System.out.println("Vowels Count : " + vowels);
	}

}
