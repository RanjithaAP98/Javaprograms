package com.xworkz.map;

import java.util.HashMap;

public class MapMethodsExample {

	public static void main(String[] args) {
		
	    HashMap<String, String> capitalCities = new HashMap<String, String>(); // Create a HashMap object called capitalCities

	    capitalCities.put("England", "London");  // Add keys and values (Country, City)
	    capitalCities.put("India", "New Delhi");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    
	    System.out.println(capitalCities);
	    
	    System.out.println();
	    System.out.println(capitalCities.size()); //size() method
	    
	    System.out.println();
	    System.out.println("Capitalcity of India is :" +capitalCities.get("India")); //get(Object key) method
	    System.out.println("Capitalcity of USA is :" +capitalCities.get("USA"));
	    
	    System.out.println();
	    System.out.println(capitalCities.putIfAbsent("Germany", "Berlin")); //putIfAbsent(K key,V value) method
	    System.out.println(capitalCities.putIfAbsent("Londan", "United Kingdom"));
	    
	    System.out.println();
	    System.out.println("Does the map contain Country : Norway ? " + capitalCities.containsKey("Norway")); //containsKey(Object key) method
	    System.out.println("Does the map contain Capitalcity : Washington DC ? " + capitalCities.containsValue("Washington DC")); //containsValue(Object value) method
	    
	    System.out.println();
	    System.out.println("replace() method:" +capitalCities.replace("India", "New Delhi", "Delhi")); //replace(K key,V oldValue,V newValue) method
	    
	    capitalCities.remove("England");  //remove(Object key)method
	    capitalCities.remove("Norway", "Oslo"); //remove(Object key, Object value) method
	    System.out.println();
	    System.out.println(capitalCities);
	    
	    capitalCities.clear(); //clear() method
	    System.out.println();
	    System.out.println(capitalCities);

	}

}
