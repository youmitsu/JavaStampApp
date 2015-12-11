package ex03_13k1137;

import java.awt.Color;

public class BigSquare extends Square{
	protected int sideLength = 36;
	
	public BigSquare(){
		this(Color.BLACK);
	}
	
	public BigSquare(Color color){
		super(color);
		width = (int)(sideLength*times);
		height = (int)(sideLength*times);
//		System.out.println("bigsquare:"+sideLength);
	}
	
	@Override
	public String toString(){
		return "BigSquare";
	}

}
