
public class FibonacciSeries {
	public static void main(String[] args) 
	{
	 System.out.println("program to illustrate fibonacci series:");
		int f1=0,f2=1,n=5,f3=0;
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
}
//i=1 f3=1+0=1 f1=1 f2=1
//i=2 f3=1+1=2 f1=1 f2=2
//i=3 f3=2+1=3 f1=2 f2=3
//i=4 f3=3+2=5 f1=3 f2=5
//i=5 f3=5+3=8 f1=5 f2=8
