
public class Lampoperation {
	public static void main(String[] args) 
	{ 
		 System.out.println("Begin creating lamp");

		Lamp floorlamp = new Lamp();
		floorlamp.company="bajaj";
		floorlamp.color=" green";
		floorlamp.range="wide";
		
		String lampswitchon="on";
		String lampswitchoff="off";
		floorlamp.turnonlamp(lampswitchon);
		floorlamp.turnofflamp(lampswitchoff);
		
		System.out.println("Ending creating lamp");
}
}