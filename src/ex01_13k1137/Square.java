package ex01_13k1137;

import java.awt.Color;

public abstract class Square extends Rectangle{
	public Square(int sideLength){
		super(sideLength,sideLength);
	}
	
	public Square(int sideLength,Color color){
		super(sideLength,sideLength,color);
	}

}
