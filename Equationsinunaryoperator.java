class Equationsinunaryoperator{
      public static void main(String args[]){
		int i=24;
		i=i++ + ++i;
		System.out.println("the new value of i is :" +i);

		int a=5,b=10;
		int c=a + b + a++ + b++ + ++a + ++b;
		System.out.println("the new value of c is :" +c);

		int y=7;
		y=y++ - --y + ++y - y--;
		System.out.println("the new value of y is :" +y);

		int m=36, j=19,k;
		k=m-- - m++ + --j - ++j + --m - j-- + ++m - j++;
		System.out.println("the new value of k is :" +k); 
	}
}
		