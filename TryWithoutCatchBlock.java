package com.xworkz.exceptionhandling;

public class TryWithoutCatchBlock {

	public static void main(String[] args) {
		
		//Yes,  we can have try without catch block by using finally block.
		
			  try
			  {
			   System.out.println("Executing try block"); 
			  }
			  finally
			  {
			   System.out.println("Executing finally block"); 
			  }
	}

}
