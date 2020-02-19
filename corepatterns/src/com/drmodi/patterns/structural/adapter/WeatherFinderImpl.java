package com.drmodi.patterns.structural.adapter;

public class WeatherFinderImpl implements WeatherFinder {

	@Override
	public int getTemp(int zipcode) {
		return 30;
	}

}
