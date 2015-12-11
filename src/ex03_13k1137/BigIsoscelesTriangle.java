package ex03_13k1137;

import java.awt.Color;

public class BigIsoscelesTriangle extends IsoscelesTriangle{
	
	public BigIsoscelesTriangle(){
		this(Color.BLACK);
	}
	
	public BigIsoscelesTriangle(Color color){
		super(color);
		height = (int)(30*times);
		lengthOfBase = (int)(40*times);
	}
	
	@Override
	public String toString(){
		return "BigIsoscelesTriangle";
	}

}
