package com.drmodi.patterns.structural.adapter;

public class WeatherUI {
	
	WeatherAdapter adapter = new WeatherAdapter();
	WeatherFinderImpl finder = new WeatherFinderImpl();
	public int findTempCity(String cityName) {
		int zipcode = adapter.convertCityToZipcode(cityName);
		int temp = finder.getTemp(zipcode);
		return temp;		
	}
	

}
