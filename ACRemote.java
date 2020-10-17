package com.xworkz.interfaces;

public class ACRemote implements Remote {

	@Override
	public void powerOn() {
		System.out.println("Power on TV");
	}

	@Override
	public void powerOff() {
		System.out.println("Ppwer off TV");
	}
	
	void increaseTemp(String temp) {
		System.out.println("increase temp to " +temp);
	}

}
