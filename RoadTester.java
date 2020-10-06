package com.xworkz.arrayexample;

public class RoadTester {

	public static void main(String[] args) {
		
		Road[] roadarray = new Road[4];
		
		Road nationalHighway = new Road();
		nationalHighway.type= "nationalHighway";
		nationalHighway.isOneway = true;
		roadarray[0]=nationalHighway;
		
		Road districtHighway = new Road();
		districtHighway.type= "districtHighway";
		districtHighway.isOneway = true;
		roadarray[1]=districtHighway;
		
		Road villageroad= new Road();
		villageroad.type= "villageroad";
		villageroad.isOneway = false;
		roadarray[3]=villageroad;
		
		for(int i=0; i<roadarray.length; i++) {
			if(roadarray[i] != null) {
				Road r = roadarray[i];
				 // System.out.println(roadarray[i]);
				r.displayDetails();
			}
		}			
	}

}
