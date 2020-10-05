
public class MethodPALINDROME {
	public void palindrome(int num) 
	{ 
		 int sum=0, reverse;
		 int temp=num;
		   
		 while(num>0)
		 {
			 reverse=num%10;
			 sum=(sum*10)+reverse;
			 num=num/10;
		 }
		 if(temp==sum)
			 System.out.println("The numbers is Palindrome");
		 else
			 System.out.println("The numbers is Not Palindrome");
	}
		 
public static void main(String[] args) {
	 System.out.println("program to find numbers is Palindrome OR not Palindrome :");
	 MethodPALINDROME check=new  MethodPALINDROME();
			 check.palindrome(12345);
	 check.palindrome(12321);
}
}