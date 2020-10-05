
public class MethodFibonacci {
	public void fib(int f1,int f2,int n,int f3) 
	{
	 	System.out.print(f1+ " ");
		System.out.print(f2+ " ");
		for(int i=1;i<=n;i++)
		{
			f3=f2+f1;
			f1=f2;
			f2=f3;
			System.out.print(f3+" ");
		}
	}
	public static void main(String[] args) 
	{
	 System.out.println("program to illustrate fibonacci series:");
	 
	 MethodFibonacci check = new MethodFibonacci();
	 check.fib(0,1,5,0);
	}
}
