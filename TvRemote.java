package com.xworkz.interfaces;

public class TvRemote implements Remote {

	@Override
	public void powerOn() {
		System.out.println("Power on TV");
	}

	@Override
	public void powerOff() {
		System.out.println("Ppwer off TV");
	}
	
	void chanelChange() {
		System.out.println("change chanel");
	}
	
	void volumeIncrease() {
		System.out.println("Increase volume");
	}
	void volumeDecrease() {
		System.out.println("decrease volume");
	}

}
