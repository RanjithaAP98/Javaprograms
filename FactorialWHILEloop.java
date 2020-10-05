
public class FactorialWHILEloop {
	public static void main(String[] args) 
	{
		int fact=1, i=1;
		int num=5;
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("factorial of number " +num + " is "   + fact);
		}
			
}
