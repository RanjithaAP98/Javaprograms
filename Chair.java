package com.xworks.accessmodifiers.classex;

public class Chair{
	
	public String material;
	private int weight;
	String color;
	protected double price;
	
	public Chair(){
		 System.out.println("Constructor with no argument");
	}
		private Chair(int inweight) {
	weight=inweight;	
	}
	
	Chair(String incolor){
		color=incolor;
	}
	protected Chair(double inprice) {
		price=inprice;
	}
	Chair(String inmaterial,int inweight,String incolor, double inprice){
		 material=inmaterial;
		weight=inweight;
		color=incolor;
		 price=inprice;
	}
	
	private void rolling() {
		 System.out.println("Rolling the chair");
	 }
	 void moving() {
		 System.out.println("moving the chair");
	 }
	 
	public  void displayDetails() {
		rolling();
		 System.out.println("display details of the chair");
		 System.out.println("material:" +material + "  Weight: " +weight + "color:" +color + "price:" +price );
	 }
}