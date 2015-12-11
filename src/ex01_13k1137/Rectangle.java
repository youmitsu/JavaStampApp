package ex01_13k1137;

import java.awt.Color;

public abstract class Rectangle extends Polygon{
	int width;
	int height;
	
	public Rectangle(int width, int height){
		super(4);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(int width, int height, Color color){
		super(4, color);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double area(){
		return height * width;
	}

}
