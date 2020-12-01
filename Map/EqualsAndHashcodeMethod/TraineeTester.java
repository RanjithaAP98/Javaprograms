package com.xworkz.collection.equalandhashcode;

import java.util.HashMap;

public class TraineeTester {
	
public static void main(String[] args) {
		
			//Trainee-NoOfClasses
			HashMap<Trainee,Integer> trainee = new HashMap<Trainee,Integer>();
			
			Trainee t1 = new Trainee("Ranjitha", 22);
			Trainee t2 = new Trainee("Gagana", 24);
			Trainee t3 = new Trainee("Ranjitha", 22);
			
			trainee.put(t1, 60);
			trainee.put(t2, 120);
			trainee.put(t3, 60);
			
			System.out.println(trainee);
			
			//Traversing :
			System.out.println();		
			trainee.forEach((k,v) -> System.out.println("key: "+ k + " Value: "+ v));
		

	}

}

// Output:

// {Trainee [trainee=Ranjitha, numOfClass=22]=60, Trainee [trainee=Gagana, numOfClass=24]=120}

// key: Trainee [trainee=Ranjitha, numOfClass=22] Value: 60
// key: Trainee [trainee=Gagana, numOfClass=24] Value: 120

