class Decrementoperator{
      public static void main(String args[]){
              System.out.println("program to illustrate decrement unary operaror:");


		//post decrement
		int num=10;
		System.out.println("post decrement of number:" +num);
		int  result= num--;
		System.out.println("after post increment : " +result);
		System.out.println("the number after post decrement " +num);


		//pre decrement
		int num1=10;
		System.out.println("pre decrement of number:"+num1);
		System.out.println("after decrement:"+ --num1);
		System.out.println("the number after deincrement:"+num1);


		//in equation
		int eq= num-- + 1 + --num;
		System.out.println("the number is:"+eq);
	}
}