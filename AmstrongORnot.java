
public class AmstrongORnot {
	public static void main(String[] args) 
	{ 
		 System.out.println("program to find number is Amstrong number or not:");
		 int n=370, num,temp, total=0;
		 num=n;
		 while(num!=0)
		 {
			 temp=num%10;
			 total=total + temp*temp*temp;
			 num/=10;
		 }
         if (total==n)
        	 System.out.println(n + " is Amstrong number");
         else 	 
        	 System.out.println(n + " is not  Amstrong number");
	}
}
