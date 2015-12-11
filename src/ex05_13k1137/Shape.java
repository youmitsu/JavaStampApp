package ex05_13k1137;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

public abstract class Shape implements Drawable{
	protected Color color;
	protected Boolean filled;
	protected double times;
	
	public Shape(){
		this(Color.BLACK);
	}
	
	public Shape(Color color){
		this.color = color;
		filled = false;
		times = 1;
	}
	
	public abstract double area();
	
	@Override
	public void setColor(Color c){
		color = c;
	}
	
	@Override
	public Color getColor(){
		return color;
	}
	
	@Override
	public void setFilled(Boolean b){
		filled = b;
	}
	
	@Override
	public Boolean getFilled(){
		return filled;
	}
	
	@Override
	public void draw(int x, int y, Graphics g){
		g.setColor(color);
	}
	
	@Override
	public void drawfill(int x, int y, Graphics g){
		g.setColor(color);
	}
	
	@Override
	public Image getImage(){
		Image im = new BufferedImage(getWidth() + 10, getHeight() + 10, BufferedImage.TYPE_INT_ARGB);
		Graphics g = im.getGraphics();
		if(filled){
			drawfill(5+(getWidth()/2), 5+(getHeight()/2), g);
		}else{
			draw(5+(getWidth()/2), 5+(getHeight()/2), g);
		}
		return im;
	}
	
	@Override
	public void setTimes(double t){
		times = t;
	}
	
	@Override
	public double getTimes(){
		return times;
	}

	
	public abstract int getWidth();
	public abstract int getHeight();

}
