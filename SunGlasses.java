package com.xworkz.upcastingdowncasting;

public class SunGlasses extends Specticals {
	
	private String shade;
	private String shape;
	
	SunGlasses(){
		System.out.println("Default constructor of SunGlasses ");
	}
	
	public SunGlasses(String shade, String shape) {
		super();
		this.shade = shade;
		this.shape = shape;
	}

	@Override
	void purposeofUsage() {
		System.out.println("Sun Protection, Style");
		super.purposeofUsage();
	}
	
	@Override
	void displayDetails() {
		System.out.println("Brand: "+ getBrand() + " power: "+ getPower() + " price : "+ getPrice()+ " Shape: "+shape + " Shade: " +shade);
		super.displayDetails();
	}

	void sunProtectionLevel() {
		System.out.println("UV-rays");
	}

	public String getShade() {
		return shade;
	}

	public void setShade(String shade) {
		this.shade = shade;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}
	

	
	
	

}
