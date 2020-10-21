package com.xworkz.thiskeyword;

public class Test {
	
    int a; 
    int b; 
    
    public Test() {
    	System.out.println("Default\no-argument constructor of Test class");
	}
      
    public Test(int a, int b) { //// Parameterized constructor 
        this.a = a; 
        this.b = b; 
    } 
  
    void displayDeatils() {
        System.out.println("a = " + a + "  b = " + b); 
    } 

}
