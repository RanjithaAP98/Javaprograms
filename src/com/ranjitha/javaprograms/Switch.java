package com.ranjitha.javaprograms;

public class Switch {

	public static void main(String[] args) {
		// switch statement to select one of many code blocks to be executed.
		
		int day = 5;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		}

	}

}
	//Syntax

				//switch(expression) {
	 //									case x:
	//										// code block
    //									break;
	//									case y:
	//										// code block
	//									break;
	//									default:
	//										// code block
	//								}	