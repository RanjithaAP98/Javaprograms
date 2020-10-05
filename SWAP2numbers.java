
public class SWAP2numbers {
	public static void main(String[] args) 
	{
		int a=10, b=30;
		System.out.println("Before SWAP:");
		System.out.println("a= " +a);
		System.out.println("b= " +b);
		
		int temp=a;
		a=b;
		b= temp;
		
		System.out.println("After SWAP:");
		System.out.println("a= " +a);
		System.out.println("b= " +b);
	}
}
