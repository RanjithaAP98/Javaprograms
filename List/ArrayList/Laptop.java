package com.xworkz.collectionconcept;

public class Laptop {
	
	private String brand;
	private int price;
	private String colour;
	
	public Laptop(String brand, int price, String colour) {
		super();
		this.brand = brand;
		this.price = price;
		this.colour = colour;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", colour=" + colour + "]";
	}
	
}
