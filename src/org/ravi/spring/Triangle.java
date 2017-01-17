package org.ravi.spring;

public class Triangle {
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void draw(){
		System.out.println(type + " Triangle drawn");
	}

	public void init(){
		System.out.println("Triangle Bean is going through init.");
	}
	
	public void destroy(){
     	System.out.println("Triangle Bean will destroy now.");
	}
}
