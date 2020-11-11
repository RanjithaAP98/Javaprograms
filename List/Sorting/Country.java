package com.xworkz.collectionconcept.sorting;

public class Country implements Comparable<Country > {
	
	private int noOfStates;
	private String name;
	private String countrycode;
	
	public Country(int noOfStates, String name, String countrycode) {
		super();
		this.noOfStates = noOfStates;
		this.name = name;
		this.countrycode = countrycode;
	}

	public int getNoOfStates() {
		return noOfStates;
	}

	public void setNoOfStates(int noOfStates) {
		this.noOfStates = noOfStates;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	@Override
	public String toString() {
		return "Country [noOfStates=" + noOfStates + ", name=" + name + ", countrycode=" + countrycode + "]";
	}

	@Override
	public int compareTo(Country o) {
		int result = this.noOfStates - o.noOfStates ;
		
		  //For Ascending order
		return result;
		
		   //For Descending order
		//return o.noOfStates - this.noOfStates;
	}

}
