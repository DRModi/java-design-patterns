package com.drmodi.patterns.structural.flyweight;

public class PaintApp {
	
	public void render(int noOfShapes) {
		
		//Shape[] shapes = new Shape[noOfShapes];
		
		Shape shape = null;
		
		for(int i=0;i<noOfShapes;i++) {
			
			/*if(i%2==0) {
				shapes[i] = new Circle();
				((Circle) shapes[i]).setRadius(i);
				((Circle) shapes[i]).setLineColor("red");
				((Circle) shapes[i]).setFillColor("blue");
				shapes[i].draw();
			}else {
				shapes[i] = new Rectangle();
				((Rectangle) shapes[i]).setLength(i);
				((Rectangle) shapes[i]).setBreadth(i+1);
				((Rectangle) shapes[i]).setFillStyle("dotted");
				shapes[i].draw();
			}*/
			
			
			if(i%2==0) {
				shape = ShapeFactory.getShape("Circle");
				shape.draw(i, "red", "blue");
			}
			else {
				shape = ShapeFactory.getShape("rectanlge");
				shape.draw(i, i+1, "dotted");
			}
		}
		
	}
	

}
