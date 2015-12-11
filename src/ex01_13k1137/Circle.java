package ex01_13k1137;

import java.awt.Graphics;
import javax.swing.JPanel;

import ex02_13k1137.PaintCircle;

public abstract class Circle extends Shape{
	int radius;
	public Circle(int radius){
		super();
		this.radius = radius;
	}
	
	public void draw(int x, int y){
		super.draw(x, y);
	}
	
	@Override
	public double area(){
		return Math.PI*radius*radius;
	}
	
	

}
