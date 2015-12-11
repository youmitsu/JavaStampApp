package ex05_13k1137;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Circle extends Shape{
	protected int RADIUS;
	
	public Circle(){
		this(Color.BLACK);
	}
	
	public Circle(Color color){
		super(color);
	}
	
	@Override 
	public void draw(int x, int y, Graphics g){
		super.draw(x, y, g);
		g.drawOval(x-(getWidth()/2), y-(getHeight()/2), (int)(2*RADIUS*times), (int)(2*RADIUS*times));
	}
	
	@Override
	public void drawfill(int x, int y, Graphics g){
		super.drawfill(x, y, g);
		g.fillOval(x-(getWidth()/2), y-(getHeight()/2), (int)(2*RADIUS*times), (int)(2*RADIUS*times));
	}
	
	@Override
	public double area(){
		return Math.PI*(RADIUS*times)*(RADIUS*times);
	}
	
	@Override
	public int getWidth(){
		return (int)(2 * RADIUS*times + 1);
	}
	
	@Override
	public int getHeight(){
		return (int)(2 * RADIUS*times + 1);
	}
	
	public abstract String toString();
}
