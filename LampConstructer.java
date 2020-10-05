
public class LampConstructer {
	String company;
	String color;
	String range;
	
	LampConstructer() 
	 { System.out.println("Initializing"); }		   // No arguments 
	
	LampConstructer(String incompany)				  // one argument
	 { System.out.println("To print incompany"); 
		 company=incompany; }
	 
	LampConstructer(String incompany,String inrange)	// Two argument
	 { System.out.println("To print incompany and inrange"); 
		 company=incompany;
		 range=inrange; }
	 
	LampConstructer(String incompany, String incolor,String inrange)	// All argument
	 {
		 System.out.println("To print incompany ,intype and inrange "); 
		 company=incompany;
		 color=incolor;
		 range=inrange;
	 }	
	public void turnonlamp(String lampswitchon)
	{
	System.out.println("turn on lamp...."  + lampswitchon);
		}
	public void turnofflamp(String lampswitchoff)
	{
		System.out.println("turn off lamp...."  +lampswitchoff);
			}
}