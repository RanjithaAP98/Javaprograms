
public class MethodFindingnumofdigits {
	public void finddigits(int num) {
		 int i=0;
		 do { 
			 num/=10;
		     i++;
			} while(num!=0);
			 {
			 System.out.println("number of digits :"  + i);
		 }
	}
	public static void main(String[] args) {
		 System.out.println("program to count digits in number:");
		 MethodFindingnumofdigits check = new MethodFindingnumofdigits();
		 check.finddigits(1558);
		 check.finddigits(123);
		 
	}
}