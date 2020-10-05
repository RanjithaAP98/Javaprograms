
public class FiboncciWHILEloop {
	public static void main(String[] args) 
	{
	 System.out.println("program to illustrate fibonacci series:");
		int n=7, f1=0, f2=1,i=1,sum;
		while(i<=n)
		{
			sum=f1+f2;
		     System.out.print(f1 + " ");
		        f1=f2;
				f2=sum;
				i++;
		}
		
}
}