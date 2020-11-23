package com.xworkz.multithreading.assignment;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		System.out.println("Thread details are: " + " Id: "  + Thread.currentThread().getId() + 
							   " Name: " + Thread.currentThread().getName());
		
		ArrayList<String> pLanguages = new ArrayList<String>();
		
		pLanguages.add("C");
		pLanguages.add("C++");
                pLanguages.add("Java");
        	pLanguages.add("Html");
        	pLanguages.add("Python");
        
        System.out.println();
        System.out.println("ArrayList: " + pLanguages);
        
        //Lmbdha Expression
        
        Runnable plang = () -> {
        	
        	System.out.println("Thread details are: " + " Id: "  + Thread.currentThread().getId() + 
							   " Name: " + Thread.currentThread().getName());
        	
        	 System.out.println();
                 System.out.println("Traversing using enhanced for loop: ");
     		 for(String str : pLanguages) {
     			System.out.println(str);
     			
     			try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
     		}	
     		
     		System.out.println("End of Thread: " + " Id: " + Thread.currentThread().getId() + 
     								   " Name: " + Thread.currentThread().getName());
        };
        
        Thread t1 = new Thread(plang);
		t1.start();
		
	System.out.println();
	System.out.println("End of Thread: " + " Id: " + Thread.currentThread().getId() + 
					     " Name: " + Thread.currentThread().getName());
		
	}

}
