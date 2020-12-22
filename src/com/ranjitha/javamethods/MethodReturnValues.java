package com.ranjitha.javamethods;

public class MethodReturnValues {
	//If you want the method to return a value,
	//you can use a primitive data type (such as int, char, etc.) instead of void, and 
	//use the return keyword inside the method:

  static int myMethod(int x) {
    return 5 + x;
  }

  public static void main(String[] args) {
    System.out.println(myMethod(3));
  }
}
