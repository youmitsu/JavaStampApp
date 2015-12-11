package ex03_13k1137;

import java.awt.Color;

public class SmallCircle extends Circle{
	
	public SmallCircle(){
		this(Color.BLACK);
	}
	
	public SmallCircle(Color color){
		super(color);
		RADIUS = (int)(10*times);
	}
	
	@Override
	public String toString(){
		return "SmallCircle";
	}

}
