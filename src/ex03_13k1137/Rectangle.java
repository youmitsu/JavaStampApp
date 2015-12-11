package ex03_13k1137;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Rectangle extends Polygon{
	protected int width;
	protected int height;
	
	public Rectangle(){
		this(Color.BLACK);
	}
	
	public Rectangle(Color color){
		super(4,color);
	}
	
	@Override
	public void draw(int x, int y, Graphics g){
		super.draw(x, y, g);
		g.drawRect(x-(getWidth()/2), y-(getHeight()/2), (int)(width*times),(int)(height*times));
	//	System.out.println("width = "+ width +",height = "+ height);
	}
	
	@Override 
	public void drawfill(int x, int y, Graphics g){
		super.drawfill(x, y, g);
		g.fillRect(x-(getWidth()/2), y-(getHeight()/2),(int) (width*times), (int)(height*times));
	}
	
	@Override
	public double area(){
		return height*times * width*times;
	}
	
	@Override
	public int getWidth(){
		return (int)(width*times);
	}
	
	@Override
	public int getHeight(){
		return (int)(height*times);
	}
	
	public abstract String toString();

}
