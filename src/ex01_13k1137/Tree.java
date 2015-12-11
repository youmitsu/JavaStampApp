package ex01_13k1137;
 
import java.awt.Color;

public class Tree implements CompoundDrawable{
	SmallSquare  p1;
	BigIsoscelesTriangle p2;
	BigIsoscelesTriangle p3;
	SmallIsoscelesTriangle p4;
	public void getParts(){
		 p1 = new SmallSquare(Color.ORANGE);
		 p2 = new BigIsoscelesTriangle(Color.GREEN);
		 p3 = new BigIsoscelesTriangle(Color.GREEN);
		 p4 = new SmallIsoscelesTriangle(Color.GREEN);
	}
	
	public void draw(int x, int y){
		getParts();
		p1.draw(50, 74);
		p2.draw(50, 60);
		p3.draw(50, 44);
		p4.draw(50, 29);
	}
	
	public void drawfill(int x, int y){
		
	}
	
	public void setColor(Color c){
		
	}
	
	public Color getColor(){
		return null;
	}

}
