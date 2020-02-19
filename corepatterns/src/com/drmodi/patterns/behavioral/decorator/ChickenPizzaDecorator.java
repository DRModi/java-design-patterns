package com.drmodi.patterns.behavioral.decorator;

public class ChickenPizzaDecorator extends PizzaDecorator {

	public ChickenPizzaDecorator(Pizza pizza) {
		super(pizza);
	}
	
	public void back() {
		super.back();
		System.out.println("Adding chicken toppings!!");
	}
	

}
