package com.javaex.objectclass.example1;

public class Rectangle {
	private int width;
	private int height;
	
	// 생성자
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle){
			Rectangle other = (Rectangle)obj;
			return width * height == other.width* other.height;
		}
		return super.equals(obj);
}
	@Override
	public String toString() {
		
		return "Rectangle [width=" + width + ", height=" + height + ",area=" + (width*height)+ "]";
	}

	
	}
