
public class MethodArithmeticOprn {
	public void ar(int num1,int num2)
	{
	System.out.println("The addition of 2 variables");
	int rst=num1+num2;
	System.out.println("The sum of 2 numbers:" +rst);

	System.out.println("The subtraction of 2 variables");
     rst = num1-num2;
	System.out.println("The difference of 2 numbers:" +rst);


	System.out.println("The Multiplication  of 2 variables");
	rst= num1*num2;
	System.out.println("The product of 2 numbers:" +rst);


	System.out.println("The Division  of 2 variables");
	rst= num1/num2;
	System.out.println("The quotient of 2  numbers  :" +rst);

	System.out.println("The Reminder  of 2 variables");
	rst= num1%num2;
	System.out.println("The reminder of 2  numbers  is :" +rst);
	}
	public static void main(String args[]){
		System.out.println(".......All Arithmetic Operations........");
		
		MethodArithmeticOprn check= new MethodArithmeticOprn();
		check.ar(3,9);
}
}
