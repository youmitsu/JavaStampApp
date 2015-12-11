package ex03_13k1137;

import java.awt.Color;

public class BigRectangle extends Rectangle{
	
	public BigRectangle(){
		this(Color.BLACK);
	}
	
	public BigRectangle(Color color){
		super(color);
		width = (int)(40*times);
		height = (int)(20*times);
	}
	
	@Override
	public String toString(){
		return "BigRectangle";
	}

}
