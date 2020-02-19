package com.drmodi.patterns.structural.adapter;

public class TestAdapter {
	
	public static void main(String args[]) {
		WeatherUI ui = new WeatherUI();
		System.out.println("Temp of 94523 - "+ui.findTempCity("PleasantHill"));
	}

}
