
public class MethodSWAP2num {
	public void swap(int a,int b) 
	{
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
	public static void main(String[] args) 
	{
		MethodSWAP2num check= new MethodSWAP2num();
		check.swap(20,30);
}
}