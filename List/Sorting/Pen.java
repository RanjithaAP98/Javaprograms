package com.xworkz.collectionconcept.sorting;

public class Pen implements Comparable<Pen> {
	
	private String brand;
	private int price;
	private String inkcolor;
	
	public Pen(String brand, int price, String inkcolor) {
		super();
		this.brand = brand;
		this.price = price;
		this.inkcolor = inkcolor;
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

	public String getInkcolor() {
		return inkcolor;
	}

	public void setInkcolor(String inkcolor) {
		this.inkcolor = inkcolor;
	}

	@Override
	public String toString() {
		return "Pen [brand=" + brand + ", price=" + price + ", inkcolor=" + inkcolor + "]";
	}

	@Override
	public int compareTo(Pen o) {
		int result = this.brand.compareTo(o.brand);
		return result;
	}

}
