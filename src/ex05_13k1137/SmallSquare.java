package ex05_13k1137;

import java.awt.Color;

public class SmallSquare extends Square{
	protected int sideLength = 8;
	
	public SmallSquare(){
		this(Color.BLACK);
	}
	
	public SmallSquare(Color color){
		super(color);
		width = (int)(sideLength*times);
		height = (int)(sideLength*times);
	}

	@Override
	public String toString() {
		return "SmallSquare";
	}

}
