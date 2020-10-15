package com.xworkz.upcastingdowncasting;

public class Specticals {
	
	private String brand;
	private double power;
	private double price;
	
	Specticals(){
		System.out.println("Default constructor of Specticals ");
	}
	public Specticals(String brand, double power, double price) {
		super();
		this.brand = brand;
		this.power = power;
		this.price = price;
	}
	
	void purposeofUsage() {
		System.out.println("reading, goggles, power");	
	}
	
	void displayDetails() {
		System.out.println("Brand: "+ brand + " power: "+ power + " price : "+ price);
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

	
}
