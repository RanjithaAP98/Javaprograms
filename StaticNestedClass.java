package com.xworkz.innerclass;

public class StaticNestedClass {  // OuterClass
	
	//A static member class is defined like a member class, but with the keyword static.
	//Despite its position inside another class, a static member class is actually an "outer" class--it has no special access to names in its containing class. 
	
		   public void method1() {
				   System.out.println("This belongs to Outer Class");
		   }

		   static class Nested
		   {
		      public void method1() {
		         System.out.println("This belongs to Static Nested Class");
		      }
		   }

		   public static void main(String args[]) {
		      StaticNestedClass.Nested n = new StaticNestedClass.Nested();	
		      n.method1();
		   }		

}
