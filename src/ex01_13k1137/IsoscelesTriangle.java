package ex01_13k1137;

import java.awt.Color;

public abstract class IsoscelesTriangle extends Polygon{
	int height;
	int lengthOfBase;
	public IsoscelesTriangle(int height, int lengthOfBase){
		super(3);
		this.height = height;
		this.lengthOfBase = lengthOfBase;
	}
	
	public IsoscelesTriangle(int height, int lengthOfBase,Color color){
		super(3,color);
		this.height = height;
		this.lengthOfBase = lengthOfBase;
	}
	
	
	@Override
	public double area(){
		return height * lengthOfBase/2;
	}

}
