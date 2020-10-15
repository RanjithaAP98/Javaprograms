package com.xworkz.wrapperclass;

public class CharWrapperClass {

	public static void main(String[] args) {
		
		System.out.println("program starts");
		
		char ch = 'A';
		Character c = new Character(ch); // Boxing 		// Wrapping
		System.out.println(c);
		
		Character ch1 = ch;  //AutoBoxing
		System.out.println(ch1);
		
		
		char ch2 = Character.valueOf(c); //Unboxing // UnWrapping
		System.out.println(ch2);
		
		char ch3 = c; // AutoUnboxing
		System.out.println(ch3);
		
		System.out.println("program ends");
	}

}
