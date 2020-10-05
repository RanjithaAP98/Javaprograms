
public class FactorialOfNumber {
	public static void main(String[] args) 
	{
		int n=5,fact=1;
		for(int i=1;i<=n;i++)
			fact*=i;
		System.out.println("The Factorial of number" +n+ " is "+fact);
	}

}


					// i=1 factoroal =1*1=1
					//i=2 factoroal =1*2=2
					//i=3 factoroal =2*3=6
					//i=4 factoroal =6*4=24
					//i=5 factoroal =24*5=120