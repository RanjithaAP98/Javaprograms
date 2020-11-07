package com.xworkz.stringconcepts;

public class CheckForAlphabets {
	
	public static boolean isStringOnlyAlphabet(String str) { 
		
        return ((str != null) 
                && (!str.equals(" ")) 
                && (str.chars().allMatch(Character::isLetter))); 
    } 
	
	public static void main(String[] args) {
		
		String str = "Mike check 123 123!!";
		
		System.out.println("Check only alphabets in String : " + isStringOnlyAlphabet(str));
		
	}
	
		

}
