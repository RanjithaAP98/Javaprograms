package com.xworkz.exceptionhandling;

public class PalindromeCheck {
	
	public static void main (String args[]) {
	System.out.println("Program starts");
	
	int n = 0;
	
	PalindromeCheck pc = new PalindromeCheck();
	
	try {
		pc.Palindrome(n);
	}
	catch(Exception e)
	{  
		System.out.println("Exception occured");
	}

}
	void Palindrome(int n) throws Exception {
	
		int r,sum=0,temp;
	
		if( n==0 ) {
			throw new Exception();
		}
	    else {
	    	temp = n;    
	    	while(n>0){    
	    		r=n%10;  //getting remainder  
	    		sum=(sum*10)+r;    
	    		n=n/10;    
		  }    
	
	    if(temp==sum)    
	    	System.out.println(" The number is palindrome number ");    
	  else    
		  	System.out.println("not palindrome number");    
	}  
}

}

