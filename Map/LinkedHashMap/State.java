package com.xworkz.map;

public class State {
	
	private String name;
	private int noOfDistrict;
	private long population;
	
	public State(String name, int noOfDistrict, long population) {
		super();
		this.name = name;
		this.noOfDistrict = noOfDistrict;
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfDistrict() {
		return noOfDistrict;
	}

	public void setNoOfDistrict(int noOfDistrict) {
		this.noOfDistrict = noOfDistrict;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "State [name=" + name + ", noOfDistrict=" + noOfDistrict + ", population=" + population + "]";
	}

}
