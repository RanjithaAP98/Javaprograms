package com.xworkz.collectionconcept;

public class Company {
	
	private String name;
	private int founded ;
	private String location;
	
	public Company(String name, int founded, String location) {
		super();
		this.name = name;
		this.founded = founded;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFounded() {
		return founded;
	}

	public void setFounded(int founded) {
		this.founded = founded;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", founded=" + founded + ", location=" + location + "]";
	}

}
