package com.xworkz.innerclass;

public class BangloreWeather implements Weather { 

	@Override
	public void tempInCent(int temp) {
		System.out.println("Temp in Banglore is :" + temp);
	}

	@Override
	public void AQI() {
		System.out.println("AQI in Banglore is :"+ 77);
	}

	@Override
	public void humidity() {
		System.out.println("Humidity in Banglore is :"+ 90 +" %");
	}


}
