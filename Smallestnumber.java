class Smallestnumber{
      public static void main(String args[]){
	int a=10;
	int b=20;
	int c=5;
	int smallest;

	if(a<b && a<c){
		smallest=a;
		} else if(b<c) {
			smallest =b;
		}
	else {
		smallest=c;
			
	}
		System.out.println("the smallest number is" + smallest);
      }
}        