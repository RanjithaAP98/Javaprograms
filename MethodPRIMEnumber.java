
public class MethodPRIMEnumber {
	public  void primenum(int num) 
	{
		int count=0;
		for(int i=1;i<=num;i++)
			if(num%i!=0) {
				count=count;
			} else {
				count=count+1;
			}
		if(count>2) {
			System.out.println( "The number is not prime number");
		}else {
			System.out.println( "The number" + num + " is prime number");
				
			}
	}

	public static void main(String[] args) 
	{
		System.out.println("the program to find number is prime or not:");
		 MethodPRIMEnumber check = new  MethodPRIMEnumber();
		 check.primenum(7);
		 check.primenum(9);	 
	}
}