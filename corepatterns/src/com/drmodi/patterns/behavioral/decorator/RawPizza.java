package com.drmodi.patterns.behavioral.decorator;

public class RawPizza implements Pizza {

	@Override
	public void back() {
		System.out.println("Raw Pizza Backed!!");
	}

}
