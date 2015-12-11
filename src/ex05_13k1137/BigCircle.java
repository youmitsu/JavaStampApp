package ex05_13k1137;

import java.awt.Color;

public class BigCircle extends Circle{
	
	public BigCircle(){
		this(Color.black);
	}
	
	public BigCircle(Color color){
		super(color);
		RADIUS = (int)(26*times);
	}
	
	@Override
	public String toString(){
		return "Big Circle";
	}

}
