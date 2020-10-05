
public class Notebook {
	String company;
	String type;
	int price;
	 Notebook() 
	 { System.out.println("Initializing"); }		   // No arguments 
	
	 Notebook(String incompany)							// one argument
	 { System.out.println("To print incompany"); 
		 company=incompany; }
	 
	 Notebook(String incompany,int inprice)				// Two argument
	 { System.out.println("To print incompany and inprice"); 
		 company=incompany;
		 price=inprice; }
	 
	 Notebook(String incompany, String intype ,int inprice)	// Three argument
	 {
		 System.out.println("To print incompany ,intype and inprice "); 
		 company=incompany;
		 type= intype;
		 price=inprice;
	 }
	 
	 public void writing() {
		 System.out.println("writing on book");
	 }
	 public void drawing() {
		 System.out.println("drawing on book");
	 }
}
