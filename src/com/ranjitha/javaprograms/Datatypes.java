package com.ranjitha.javaprograms;

public class Datatypes {

	public static void main(String[] args) {
		
			int myNum = 5;               // integer (whole number)
		    float myFloatNum = 5.99f;    // floating point number
		    char myLetter = 'D';         // character
		    boolean myBool = true;       // boolean
		    String myText = "Hello";     // String    
		    System.out.println(myNum);
		    System.out.println(myFloatNum);
		    System.out.println(myLetter);
		    System.out.println(myBool);
		    System.out.println(myText);
		    
		    //Primitive Data Types
		    System.out.println();
		    System.out.println("Primitive Data Types"); 
		    
		    byte myNum1 = 100; //from -128 to 127
		    System.out.println(myNum1); 
		    
		    short myNum2 = 5000; //from -32768 to 32767:
		    System.out.println(myNum2);
		    
		    int myNum3 = 100000; // from -2147483648 to 2147483647. 
		    System.out.println(myNum3);
		    
		    long myNum4 = 15000000000L; //from -9223372036854775808 to 9223372036854775807. 
		    System.out.println(myNum4);
		    
		    float myNum5 = 5.75f; // from 3.4e−038 to 3.4e+038
		    System.out.println(myNum5);
		    
		    double myNum6 = 19.99d; // from 1.7e−308 to 1.7e+308
		    System.out.println(myNum6);
		    
		    //A boolean data type can only take the values true or false
		    boolean isJavaFun = true;
		    boolean isFishTasty = false;
		    System.out.println(isJavaFun);     // Outputs true
		    System.out.println(isFishTasty);   // Outputs false
		    
		   // The char data type is used to store a single character. 
		   // The character must be surrounded by single quotes
		    char mychar = 'B';
		    System.out.println(mychar);
		    
		    //Non-Primitive Data Types ( String, array, custom object)
		    System.out.println();
		    System.out.println("Non-Primitive Data Types");
		    
		   // The String data type is used to store a sequence of characters (text)
		   // String values must be surrounded by double quotes
		    String greeting = "Hello World";
		    System.out.println(greeting);
	}

}
