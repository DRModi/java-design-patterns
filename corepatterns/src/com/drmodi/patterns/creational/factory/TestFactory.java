package com.drmodi.patterns.creational.factory;

public class TestFactory {
	
	public static void main(String[] args) {
		
		PizzaStore dominos = new PizzaStore();
		
		dominos.orderPizza("");
		
		System.out.println();
		System.out.println();
		
		System.out.println("## Ordering Chicken Pizza!");
		System.out.println();
		dominos.orderPizza("chicken");
		System.out.println();
		System.out.println();
		
		
		System.out.println("## Ordering Cheese Pizza!");
		System.out.println();
		dominos.orderPizza("cheese");

		
	}

}
