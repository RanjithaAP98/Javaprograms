package com.xworkz.collectionconcept.linkedlist;

public class Mobile {
	
	private String brand;
	private String colour;
	private int storagespsce;
	
	public Mobile(String brand, String colour, int storagespsce) {
		super();
		this.brand = brand;
		this.colour = colour;
		this.storagespsce = storagespsce;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getStoragespsce() {
		return storagespsce;
	}

	public void setStoragespsce(int storagespsce) {
		this.storagespsce = storagespsce;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", colour=" + colour + ", storagespsce=" + storagespsce + "]";
	}
	
}
