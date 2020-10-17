package com.xworkz.interfaces;

public class RemoteTester {

	public static void main(String[] args) {
		
		TvRemote tvr = new TvRemote();
		tvr.powerOff();
		tvr.powerOn();
		tvr.volumeIncrease();
		tvr.volumeIncrease();
		tvr.chanelChange();
		
		 ACRemote acr = new  ACRemote();
		 acr.powerOff();
		 acr.powerOn();
		 acr.increaseTemp("70'C");

	}

}