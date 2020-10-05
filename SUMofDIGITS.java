
public class SUMofDIGITS {
	public static void main(String[] args) 
	{ 
		 System.out.println("program to find SUM of digits in number:");
		 long n=123, sum;
		 for(sum=0;n!=0;n/=10)
		 {
			 sum+=n%10;
		 }
		 System.out.println("Sum of digits of number is " + sum);
		 }
}