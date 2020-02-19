package com.drmodi.patterns.structural.flyweight;

import java.util.HashMap;

public class ShapeFactory {
	
	//Created HashMap to cache the object based on type
	
	public static HashMap<String, Shape> shapes = new HashMap<String, Shape>();
	
	public static Shape getShape(String type) {
		Shape shape = null;
		
		if(shapes.get(type)!=null) {
			return shapes.get(type);
		}else {
			if(type.equalsIgnoreCase("circle")) {
				shape = new Circle();
				System.out.println("***** Created New Circle object !!");
			}else {
				shape = new Rectangle();
				System.out.println("***** Created New Rectangle object !!");
			}
			shapes.put(type, shape);
	}
	
		
		return shape;
	}
	

}
