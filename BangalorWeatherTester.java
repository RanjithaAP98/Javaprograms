package com.xworkz.innerclass;

public class BangalorWeatherTester {
	
	//An anonymous inner class is one that is declared 
	//and used to create one object (typically as a parameter to a method), all within a single statement.

	public static void main(String[] args) {

		BangloreWeather bangloreWeather = new BangloreWeather();
		bangloreWeather.tempInCent(22);
		bangloreWeather.AQI();
		bangloreWeather.humidity();

		//Annonymous class
		Weather weather = new Weather() {  //Annonymousclass
			@Override
			public void tempInCent(int temp) {
				System.out.println();
				System.out.println("Temp in Delhi is :" + temp);
			}

			@Override
			public void AQI() {
				System.out.println("AQI in Delhi is :"+ 77);
			}

			@Override
			public void humidity() {
				System.out.println("Humidity in Delhi is :"+ 90 +" %");
			}
		};

		weather.tempInCent(26);
		weather.AQI();
		weather.humidity();
	}
}
