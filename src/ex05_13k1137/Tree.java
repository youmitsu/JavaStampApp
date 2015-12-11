package ex05_13k1137;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class Tree implements CompoundDrawable {
	Drawable[] parts;
	Color color;
	Boolean filled;
	double times;

	public Tree() {
		parts = new Drawable[4];
		color = null;
		filled = true;
		times = 1;

		parts[0] = new SmallSquare();
		parts[1] = new BigIsoscelesTriangle();
		parts[2] = new BigIsoscelesTriangle();
		parts[3] = new SmallIsoscelesTriangle();
	}

	@Override
	public void setDefaultColor() {
		parts[0].setColor(new Color(128, 64, 0));
		parts[1].setColor(Color.GREEN);
		parts[2].setColor(Color.GREEN);
		parts[3].setColor(Color.GREEN);
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
	public void draw(int x, int y, Graphics g) {
		if (color == null) {
			setDefaultColor();
		}else{
			setSelectedColor();
		}
		parts[0].draw(x, y + (int)(20*times), g);
		parts[1].draw(x, y, g);
		parts[2].draw(x, y - (int)(20*times), g);
		parts[3].draw(x, y - (int)(35*times), g);
	}

	public void drawfill(int x, int y, Graphics g) {
		if (color == null) {
			setDefaultColor();
		}else{
			setSelectedColor();
		}
		for (int i = 0; i < parts.length; i++) {
			if (filled == true) {
				parts[i].setFilled(true);
			}
		}
		parts[0].drawfill(x, y + (int)(20*times), g);
		parts[1].drawfill(x, y, g);
		parts[2].drawfill(x, y - (int)(20*times), g);
		parts[3].drawfill(x, y - (int)(35*times), g);
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
	public Drawable[] getParts() {
		return parts;
	}

	@Override
	public int getWidth() {
		return (int)(parts[1].getWidth()*times);
	}

	@Override
	public int getHeight() {
		int h = 0;
		for (int i = 0; i < parts.length; i++) {
			h += parts[i].getHeight()*times;
		}
		return h;
	}

	@Override
	public String toString() {
		return "Tree";
	}

	@Override
	public Image getImage() {
		Image im = new BufferedImage(getWidth() + 5, getHeight() -10,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = im.getGraphics();
		if (filled) {
			drawfill(3+(getWidth() / 2), 6+(getHeight() / 2), g);
		} else {
			draw(3 + (getWidth() / 2), 6 + (getHeight() / 2), g);
		}
		return im;
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
