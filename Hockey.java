package com.xworkz.interfaces;

public interface Hockey {
	
	public void homeGoalScored();
	
	default public void visitingGoalScored() {
		System.out.println("visit Goal Scored points");
	}
}
