package com.drmodi.patterns.behavioral.decorator;

public class TestDecorators {
	
	public static void main(String args[]) {
		
		//. Create Raw plain pizza - testing purpose.
		Pizza pizza = new RawPizza();
		pizza.back();
		
		System.out.println("\n");
		
		//1. create cheese pizza
		Pizza cheesePizza = new CheesePizzaDecorator(pizza);
		cheesePizza.back();
		
		System.out.println("\n");
		
		//2. Adding Veggie to cheese pizza
		Pizza veggiePizza = new VeggiePizzaDecorator(new CheesePizzaDecorator(pizza));
		veggiePizza.back();
		
		System.out.println("\n");
		
		//3. Making combo pizza
		Pizza comboPizza = new ChickenPizzaDecorator(new VeggiePizzaDecorator(new CheesePizzaDecorator(pizza)));
		comboPizza.back();
	}

}
