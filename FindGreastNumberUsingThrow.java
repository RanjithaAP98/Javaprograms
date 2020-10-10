package com.xworkz.exceptionhandling;

public class FindGreastNumberUsingThrow {

	public static void main(String[] args) {
		
		System.out.println("Program starts");
		
		int a = 0 , b=10, c=30;
		
		FindGreastNumberUsingThrow fgn = new FindGreastNumberUsingThrow();
		
		try {
			fgn.FindGreastNumber(a,b,c);
		}
		catch(Exception e)
		{  
			System.out.println("Exception occured");
		}

	}
	void FindGreastNumber(int a, int b, int c) throws Exception {
		
		if( a==0 || b==0 || c==0) {
			// Exception e = new Exception();
			throw new Exception();
		} 
		
		 if(a>b && a>c) {
			System.out.println("Greast number is: " +a);	
		}
		else if (b>c) 
		{
			System.out.println("Greast number is: " +b);
		}
		else {
			System.out.println("Greast number is: " +c);
		}
		
	}

}
