package ex05_13k1137;

import java.awt.Color;

public class SmallRectangle extends Rectangle{
	
	public SmallRectangle(){
		this(Color.BLACK);
	}
	
	public SmallRectangle(Color color){
		super(color);
		width = (int)(20*times);
		height = (int)(10*times);
	}
	
	@Override
	public String toString(){
		return "SmallRectangle";
	}

}
