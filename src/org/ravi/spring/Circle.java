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
	
	public void init(){
		System.out.println("Circle Bean is going through init.");
	}
	
	public void destroy(){
     	System.out.println("Circle Bean will destroy now.");
	}
}
