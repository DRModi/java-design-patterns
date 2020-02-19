package com.drmodi.patterns.behavioral.decorator;

public class VeggiePizzaDecorator extends PizzaDecorator {

	public VeggiePizzaDecorator(Pizza pizza) {
		super(pizza);
	}
	
	public void back() {
		super.back();
		System.out.println("Adding Veggie Toppings!!");
	}
	
	

}
