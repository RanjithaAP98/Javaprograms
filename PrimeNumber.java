
public class PrimeNumber {
	public static void main(String[] args) 
	{
		int num=7, count=0;
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
}
