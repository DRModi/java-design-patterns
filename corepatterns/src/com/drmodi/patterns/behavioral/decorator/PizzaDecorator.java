package com.drmodi.patterns.behavioral.decorator;

public class PizzaDecorator implements Pizza{
	
	private Pizza pizza;
	
	public PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public void back() {
		pizza.back(); //what ever pizza will call this, it will back that pizza.
	}

}
