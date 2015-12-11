package ex03_13k1137;

import java.awt.Color;

public class SmallIsoscelesTriangle extends IsoscelesTriangle{
	
	public SmallIsoscelesTriangle(){
		this(Color.BLACK);
	}
	
	public SmallIsoscelesTriangle(Color color){
		super(color);
		height = (int)(16*times);
		lengthOfBase = (int)(16*times);
	}
	
	@Override
	public String toString(){
		return "SmallIsoscelesTriangle";
	}

}
