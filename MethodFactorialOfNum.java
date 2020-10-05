
public class MethodFactorialOfNum {
	public void factnum(int n) 
	{
		int fact=1;
		for(int i=1;i<=n;i++)
			fact*=i;
		System.out.println("The Factorial of number" +n+ " is "+fact);
	}
	public static void main(String[] args) 
	{
		System.out.println(" .....Factorial of number....");
		MethodFactorialOfNum check =new MethodFactorialOfNum();
		check.factnum(5);
}
}