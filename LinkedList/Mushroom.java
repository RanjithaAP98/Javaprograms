package com.xworkz.collectionconcept.linkedlist;

public class Mushroom {
	
	private String name;
	private boolean isEdible;
	private String benefits;
	
	public Mushroom(String name, boolean isEdible, String benefits) {
		super();
		this.name = name;
		this.isEdible = isEdible;
		this.benefits = benefits;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isEdible() {
		return isEdible;
	}

	public void setEdible(boolean isEdible) {
		this.isEdible = isEdible;
	}

	public String getBenefits() {
		return benefits;
	}

	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}

	@Override
	public String toString() {
		return "Mushroom [name=" + name + ", isEdible=" + isEdible + ", benefits=" + benefits + "]";
	}

}
