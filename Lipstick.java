package com.xworkz.encapsulation;

public class Lipstick {
	 private String brand;
	 private int price;
	 private String type;
	  
	 public Lipstick(int price, String type) {
		 brand = "Lakme lipstick 9 to 5";
		 price= price;
		 type= type;
	 }
	 
	 private void setbrand(String inbrand) {
		 brand=inbrand; }
	 
	 public String getbrand() {
		 System.out.println("The brand is : " +brand);
		 return brand;
	 }
	  protected int getprice() {
		  return price;}
	  
	 public void setprice(int price) {
		 this.price= price; }
	 
	 public String gettype() {
		 return type; }
	 
	public void settype(String type)
	{
		this.type = type; 
		}
}
