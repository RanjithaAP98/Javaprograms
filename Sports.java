package com.xworkz.interfaces;

public class Sports extends Football implements Hockey {

	@Override
	public void homeGoalScored() {
		System.out.println("home Goal Scored points");
	}

}
