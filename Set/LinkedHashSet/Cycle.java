package com.xworkz.collectionconcept.set;

public class Cycle {
	
	private String name;
	private int price;
	
	public Cycle(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cycle [name=" + name + ", price=" + price + "]";
	}
	
}
