package com.xworkz.collectionconcept;

import java.util.ArrayList;

public class CompanyTester {

	public static void main(String[] args) {
		
		Company c1 = new Company("Google", 2000, "Delhi");
		Company c2= new Company("Apple", 2001, "Bangalore");
		Company c3= new Company("Microsoft", 2002, "Chennai");
		Company c4= new Company("Amazon", 2003, "Mumbai");
		Company c5= new Company("Facebook", 2004, "Hyderabad");
		Company c6= new Company("whatsApp", 2005, "Kolkata");
		
		ArrayList<Company> company = new ArrayList<Company>();
		
		company.add(c1);
		company.add(c2);
		company.add(c3);
		company.add(c4);
		
		System.out.println(company);
		
		
		System.out.println();
		System.out.println("Traversing using for:");
		for(int i=0; i<company.size(); i++) {
			Company c = company.get(i);
			System.out.println(c);
		}
		
		System.out.println();
		System.out.println("Traversin using enhanced for:");
		for(Company c : company) {
			System.out.println(c);
		}
		
		System.out.println();
		System.out.println("Traversing using forEach():");
		company.forEach((c)->System.out.println(c));
		
		System.out.println();
		System.out.println("display last element: ");
		System.out.println(company.get(company.size()-1));
		
		System.out.println();
		System.out.println("update 3rd element with new element ");
		company.set(3, c5);
		System.out.println(company);
		
		System.out.println();
		System.out.println("update 0th element with new element ");
		company.set(0,c6);
		System.out.println(company);
					
	}
}
