package com.drmodi.patterns.behavioral.decorator;

public class CheesePizzaDecorator extends PizzaDecorator {

	public CheesePizzaDecorator(Pizza pizza) {
		super(pizza);
	}
	
	public void back() {
		super.back();
		System.out.println("Adding Cheese!!");
	}
	

}
