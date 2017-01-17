package org.ravi.spring;

public class FriendCircle {
	String size;
	String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	public void draw(){
		System.out.println(color + " Friend Circle drawn, whose size is : " + size);
	}
	
	public void init(){
		System.out.println("Friend Circle Bean is going through init.");
	}
	
	public void destroy(){
     	System.out.println("Friend Circle Bean will destroy now.");
	}
}
