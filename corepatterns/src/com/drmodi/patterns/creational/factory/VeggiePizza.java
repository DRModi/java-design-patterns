package com.drmodi.patterns.creational.factory;

public class VeggiePizza implements Pizza {

	
	@Override
	public void prepare() {
		System.out.println("Veggie Cheese Pizza!");
	}

	@Override
	public void bake() {
		System.out.println("Veggie Cheese Pizza!");

	}

	@Override
	public void cut() {
		System.out.println("Veggie Cheese Pizza!");

	}

}
