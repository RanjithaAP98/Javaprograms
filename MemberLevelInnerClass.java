package com.xworkz.innerclass;

public class MemberLevelInnerClass { // OuterClass
	
	void method1() {

	      class InnerClass {
	    	  
	         public void msg() {
	            System.out.println("This is an inner class ");	
	         }   
	      }

	      InnerClass ins = new InnerClass();
	      ins.msg();
	   }

	   public static void main(String args[]) {
		   MemberLevelInnerClass outer = new MemberLevelInnerClass();
	      outer.method1();
	   }

}
