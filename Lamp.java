
public class Lamp {
					// States--> Company,color,range.......
	String company;
	String color;
	String range;
	
	
					// Behavior --> turn on, turn off
	public void turnonlamp(String lampswitchon)
	{
	System.out.println("turn on lamp...."  + lampswitchon);
		}
	public void turnofflamp(String lampswitchoff)
	{
		System.out.println("turn off lamp...."  +lampswitchoff);
			}
}
