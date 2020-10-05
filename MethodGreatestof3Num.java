
public class MethodGreatestof3Num {
	public void grt(int a, int b, int c){
	int greatest;

		if(a>b && a>c){
			greatest=a;
			} else if(b>c) {
				greatest=b;
			}
		else {
			greatest=c;
				
		}
			System.out.println("the Greatest number is " + greatest);
	      }
	public static void main(String args[]){
		System.out.println("....Greatest of 3 numbers.....");
		MethodGreatestof3Num check = new MethodGreatestof3Num();
		check.grt(10, 30, 20);
		
	}
}
