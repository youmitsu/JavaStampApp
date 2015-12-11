package ex03_13k1137;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class Ball implements CompoundDrawable{
	Drawable[] parts;
	Color color;
	Boolean filled;
	double times;
	
	public Ball(){
		parts = new Drawable[4];
		color = null;
		filled  = true;
		times = 1;
		
		parts[0] = new BigCircle();
		parts[1] = new SmallRectangle();
		parts[2] = new SmallRectangle();
		parts[3] = new SmallCircle();
	}

	@Override
	public void draw(int x, int y, Graphics g) {
		if (color == null) {
			setDefaultColor();
		}else{
			setSelectedColor();
		}
		parts[0].draw(x,y,g);
		parts[1].draw(x-(int)(13*times),y,g);
		parts[2].draw(x+(int)(14*times),y,g);
		parts[3].draw(x,y,g);
	}

	@Override
	public void drawfill(int x, int y, Graphics g) {
		if (color == null) {
			setDefaultColor();
		}else{
			setSelectedColor();
		}
		parts[0].drawfill(x,y,g);
		parts[1].drawfill(x-(int)(13*times),y,g);
		parts[2].drawfill(x+(int)(14*times),y,g);
		parts[3].drawfill(x,y,g);
	}
	
	@Override
	public void setSelectedColor(){
		for (int i = 0; i < parts.length; i++) {
			parts[i].setColor(color);
		}
	}

	@Override
	public void setColor(Color c) {
		color = c;
	}

	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public void setFilled(Boolean b) {
		filled = b;
	}

	@Override
	public Boolean getFilled() {
		return filled;
	}

	@Override
	public Image getImage() {
		Image im = new BufferedImage(getWidth()+5,getHeight()+5,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = im.getGraphics();
		if(filled){
			drawfill(getWidth()/2+2,getHeight()/2+2,g);
		}else{
			draw(getWidth()/2+2,getHeight()/2+2,g);
		}
		return im;
	}

	@Override
	public int getWidth() {
		return (int)(parts[0].getWidth()*times);
	}

	@Override
	public int getHeight() {
		return (int)(parts[0].getHeight()*times);
	}

	@Override
	public Drawable[] getParts() {
		return parts;
	}

	@Override
	public void setDefaultColor() {
		parts[0].setColor(Color.red);
		parts[1].setColor(Color.darkGray);
		parts[2].setColor(Color.darkGray);
		parts[3].setColor(Color.black);
	}
	
	@Override
	public String toString(){
		return "Ball";
	}

	@Override
	public void setTimes(double t) {
		// TODO 自動生成されたメソッド・スタブ
		times = t;
		for(int i = 0; i < parts.length; i++){
			parts[i].setTimes(times);
		}
	}

	@Override
	public double getTimes() {
		// TODO 自動生成されたメソッド・スタブ
		return times;
	}

}
