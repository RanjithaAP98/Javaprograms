
public class LampConstructerTester {
	public static void main(String[] args) 
	{ 
		 System.out.println("Begin creating lamp");

		 LampConstructer floorlamp = new LampConstructer();
		 System.out.println();
		 System.out.println("company of floorlamp is :" +floorlamp.company);
		 System.out.println("color of floorlamp is :" +floorlamp.color);
		 System.out.println("range of floorlamp is :" +floorlamp.range);
		 
		 LampConstructer landspacelamp = new LampConstructer("daylight","low");
		 System.out.println();
		 System.out.println("company of landspacelamp is :" +landspacelamp.company);
		 System.out.println("color of landspacelamp is :" +landspacelamp.color);
		 System.out.println("range of landspacelamp is :" +landspacelamp.range);
			
			
		 LampConstructer ceilinglamp = new LampConstructer("bajaj","white","medium");
		 System.out.println();
		 System.out.println("company of ceilinglamp is :" +ceilinglamp.company);
		 System.out.println("color of ceilinglamp is :" +ceilinglamp.color);
		 System.out.println("range of ceilinglamp is :" +ceilinglamp.range);
			
			
		 System.out.println();
		 System.out.println("Ending creating lamp");
}

}
