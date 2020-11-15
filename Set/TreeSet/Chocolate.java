package com.xworkz.collectionconcept.set;

public class Chocolate {
	
	private String name;
	private String type;
	private String benifits;
	
	public Chocolate(String name, String type, String benifits) {
		super();
		this.name = name;
		this.type = type;
		this.benifits = benifits;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBenifits() {
		return benifits;
	}

	public void setBenifits(String benifits) {
		this.benifits = benifits;
	}

	@Override
	public String toString() {
		return "Chocolate [name=" + name + ", type=" + type + ", benifits=" + benifits + "]";
	}
	
}
