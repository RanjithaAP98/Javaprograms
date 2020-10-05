
public class CountDigitsDOWHILEloop {
	public static void main(String[] args) {
	 System.out.println("program tocount digits in number:");
	 int i=1, num=456;
	 do {
		 System.out.println();
		 i++;
	 }
		 while(num<=i);
		 {
			 num/=10;
			 i++;
			 
		 }
		 System.out.println("number of digits :"  + i);
	 }
	}