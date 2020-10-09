class Incrementoperator{
      public static void main(String args[]){
              System.out.println("program to illustrate increment unary operaror:");
		//post increment
		int num=10;
		System.out.println("post increment of number:" +num);
		int  result= num++;
		System.out.println("after post increment : " +result);
		System.out.println("the number after post increment " +num);


		//pre increment
		int num1=10;
		System.out.println("pre increment of number:"+num1);
		System.out.println("after preincrement:"+ ++num1);
		System.out.println("the number after preincrement:"+num1);
	}
}