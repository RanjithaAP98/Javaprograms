package com.xworkz.map;

import java.util.LinkedHashMap;

public class StateTester {

	public static void main(String[] args) {
		
		//State-CapitalCity
		LinkedHashMap<State,String> state = new  LinkedHashMap<State,String>();
		
		State s1=new State("Karnataka", 30, 61095297);
		State s2=new State("Goa", 2, 1458545);
		State s3=new State("West Bengal", 23, 91276115);
		State s4=new State("Kerala", 14, 33406061 );
		
		state.put(s1,"Bangaluru");
		state.put(s2,"Panaji");
		state.put(s3,"Kolkata");
		state.put(s4,"Thiruvanthapuram");
		
		System.out.println(state);
		
		//Traversing :
		System.out.println();		
		state.forEach((k,v) -> System.out.println("Key: "+ k + " Value CapitalCity: "+ v));	

	}

}
