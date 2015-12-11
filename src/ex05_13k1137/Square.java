package ex05_13k1137;

import java.awt.Color;

public abstract class Square extends Rectangle{
	protected int sideLength = 20;
	
	public Square(){
		this(Color.BLACK);
	}
	
	public Square(Color color){
		super(color);
		width = (int)(sideLength*times);
		height = (int)(sideLength*times);
//		System.out.println("square:"+sideLength);
	}
	
	
	
	public abstract String toString();

}
