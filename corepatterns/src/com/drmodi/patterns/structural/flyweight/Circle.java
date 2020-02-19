package com.drmodi.patterns.structural.flyweight;

public class Circle extends Shape {

	private String label;

//Seperate out the extrinsic state
	//private int radius;
	//private String fillColor;
	//private String lineColor;

	public Circle() {
		label = "Circle";
	}

	@Override
	public void draw(int radius, String fillColor, String lineColor) {

		System.out.println("Draw a " + label + " with a radius: " + radius + ", Fill Color: " + fillColor
				+ " and Line Color: " + lineColor);

	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	/*public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}*/

}
