package org.ravi.spring;

public class Circle {
	String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void draw(){
		System.out.println(color + " Circle drawn");
	}
}
