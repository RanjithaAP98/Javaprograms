
public class NotebookTester {
	public static void main(String[] args) {
	System.out.println("....Beginning of program creation....");
	
	//create objects for notebook
	Notebook n1= new Notebook();
	System.out.println("company of n1 is :" +n1.company);
	System.out.println("type of n1 is :" +n1.type);
	System.out.println("price of n1 is :" +n1.price);
	
	n1.writing();
	
	Notebook n2= new Notebook("vidya","unrolled",40 );
	System.out.println("company of n2 is :" +n2.company);
	System.out.println("type of n2 is :" +n2.type);
	System.out.println("price of n2 is :" +n2.price);	
	
	Notebook n3= new Notebook("classmate",55);
	System.out.println("company of n3 is :" +n3.company);
	System.out.println("type of n3 is :" +n3.type);
	System.out.println("price of n3 is :" +n3.price);
	 
	System.out.println("....Ending of program creation....");		
}
}
