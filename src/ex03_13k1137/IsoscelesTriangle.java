package ex03_13k1137;

import java.awt.Color;
import java.awt.Graphics;

public abstract class IsoscelesTriangle extends Polygon{
	protected int height;
	protected int lengthOfBase;
	
	public IsoscelesTriangle(){
		this(Color.BLACK);
	}
	
	public IsoscelesTriangle(Color color){
		super(3,color);
	}
	
	@Override
	public void draw(int x, int y, Graphics g){
		super.draw(x, y, g);
		int[] xPoints = new int[3];
		int[] yPoints = new int[3];
		xPoints[0] = x;
		xPoints[1] = (int)(x-(lengthOfBase*times/2));
		xPoints[2] = (int)(x+(lengthOfBase*times/2));
		yPoints[0] = (int)(y-(height*times/2));
		yPoints[1] = (int)(y+(height*times/2));
		yPoints[2] = (int)(y+(height*times/2));
		g.drawPolygon(xPoints, yPoints, 3);
	}
	
	@Override
	public void drawfill(int x, int y, Graphics g){
		super.drawfill(x, y, g);
		int[] xPoints = new int[3];
		int[] yPoints = new int[3];
		xPoints[0] = x;
		xPoints[1] = (int)(x-(lengthOfBase*times/2));
		xPoints[2] = (int)(x+(lengthOfBase*times/2));
		yPoints[0] = (int)(y-(height*times/2));
		yPoints[1] = (int)(y+(height*times/2));
		yPoints[2] = (int)(y+(height*times/2));
		g.fillPolygon(xPoints, yPoints, 3);
	}
	
	@Override
	public double area(){
		return lengthOfBase*times * height*times / 2;
	}
	
	@Override
	public int getWidth(){
		return (int)(lengthOfBase*times);
	}
	
	@Override
	public int getHeight(){
		return (int)(height*times);
	}

}
