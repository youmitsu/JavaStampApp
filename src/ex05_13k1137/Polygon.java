package ex05_13k1137;

import java.awt.Color;

public abstract class Polygon extends Shape{
	int numberOfVertex;

	public Polygon(int numberOfVertex){
		this(numberOfVertex,Color.BLACK);
		this.numberOfVertex = numberOfVertex;
	}
	
	public Polygon(int numberOfVertex, Color color){
		super(color);
		this.numberOfVertex = numberOfVertex;
	}

	@Override
	public abstract double area();

	@Override
	public abstract int getWidth();

	@Override
	public abstract int getHeight();

}
