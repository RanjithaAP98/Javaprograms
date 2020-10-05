
public class MethodSQUAREofNum {
	public void sqrt(int n)
	{
		int rst= n*n;
		System.out.println("square of number is :" + rst);
	}
	public static void main(String args[]){
        System.out.println("pgrm to find square of number");
        MethodSQUAREofNum check=new MethodSQUAREofNum();
        check.sqrt(4);
        check.sqrt(16);
	}
}
