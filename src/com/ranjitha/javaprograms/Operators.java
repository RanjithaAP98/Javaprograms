package com.ranjitha.javaprograms;

public class Operators {
	public static void main(String[] args) {
		
		//Arithmetic operators--> + operator , - , * , / , %
		int x = 10;
	    x += 5;
	    System.out.println(x);
	    
	    // Unary operators-->Increment,Decrement
	    int y = 5;
	    ++y; //Increases the value of a variable by 1
	    System.out.println(y); 
	    int y1= 5;
	    --y1;  //Decreases the value of a variable by 1
	    System.out.println(y1);
	    
	    // Assignment Operators-->addition assignment operator (+=), = ,+=, -=, *= ,/= ,%=, |= ,^=, >>=, <<=
	    int x1 = 10;
	    x1 += 5;
	    System.out.println(x1);
	    
	    //Comparison (Relation) Operators-->Equal to ==, != , > , <, >=, <=
	    int a1 = 5;
	    int b1 = 3;
	    System.out.println(a1 == b1); // returns false because 5 is not equal to 3
	    
	    //Logical Operators-->&&(Logical and) , || ,!
	    int k = 5;
	    System.out.println(k> 3 && k < 10); // returns true because 5 is greater than 3 AND 5 is less than 10

	   // Bitwise Operators--> & , | , ~(not) , ^(xor) 
	    int a=5;
		int b=10;
		System.out.println("a&b= " +(a&b));
		System.out.println("a|b= " +(a|b));
		System.out.println("a^b= " +(a ^b));
		System.out.println("~a= " + ~a); 
	    
	   // Shift operators--> <<, >> , >>>(zero-fill right shift)
		int c=6;
		System.out.println("The right shift of c:" +(c>>1));
		System.out.println("The left shift of c:" +(c<<2));
				//unsigned right shift operator...
		int d= -5;
		System.out.println("The unsigned right shift of b:" +(d>>>2));
}
}