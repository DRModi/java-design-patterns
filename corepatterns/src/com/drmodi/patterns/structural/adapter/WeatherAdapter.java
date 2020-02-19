package com.drmodi.patterns.structural.adapter;

public class WeatherAdapter {

	public int convertCityToZipcode(String cityName) {

		String ctName = cityName;
		int zipcode = 0;

		if (ctName != null) {
			zipcode = 94523;
		}

		return zipcode;

	}

}
