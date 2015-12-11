package ex01_13k1137;

import java.awt.Color;

public abstract class Shape implements Drawable{
	protected String name;
	public abstract double area();
	@Override
	public String toString(){
		return name+":"+area();
	}
	
	Color color;
	
	public Shape(){
		this(Color.WHITE);
	}
	
	public Shape(Color color){
		this.color = color;
	}
	
	@Override
	public void draw(int x, int y){
		System.out.println(getClass().getName()+"を("+x+","+y+")に描画");
	}
	
	@Override
	public void drawfill(int x, int y){
		System.out.println(getClass().getName()+"を("+x+","+y+")に塗りつぶして描画");
	}
	
	@Override
	public void setColor(Color c){
		color = c;
	}
	
	@Override
	public Color getColor(){
		return color;
	}
	

}
