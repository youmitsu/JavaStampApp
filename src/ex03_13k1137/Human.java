package ex03_13k1137;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class Human implements CompoundDrawable {
	Drawable[] parts;
	Color color;
	Boolean filled;
	double times;

	public Human() {
		parts = new Drawable[14];
		color = null;
		filled = true;
		times = 1;

		parts[0] = new BigCircle();
		parts[1] = new SmallSquare();
		parts[2] = new BigSquare();
		parts[3] = new BigSquare();
		parts[4] = new SmallRectangle();
		parts[5] = new SmallRectangle();
		parts[6] = new SmallCircle();
		parts[7] = new SmallCircle();
		parts[8] = new SmallSquare();
		parts[9] = new SmallSquare();
		parts[10] = new SmallSquare();
		parts[11] = new SmallSquare();
		parts[12] = new SmallCircle();
		parts[13] = new SmallCircle();
	}

	@Override
	public void setDefaultColor() {
		parts[0].setColor(new Color(255, 228, 196));
		parts[1].setColor(new Color(255, 228, 196));
		parts[2].setColor(Color.BLACK);
		parts[3].setColor(Color.BLACK);
		parts[4].setColor(Color.BLACK);
		parts[5].setColor(Color.BLACK);
		parts[6].setColor(new Color(255, 228, 196));
		parts[7].setColor(new Color(255, 228, 196));
		parts[8].setColor(Color.BLACK);
		parts[9].setColor(Color.BLACK);
		parts[10].setColor(Color.BLACK);
		parts[11].setColor(Color.BLACK);
		parts[12].setColor(new Color(255, 228, 196));
		parts[13].setColor(new Color(255, 228, 196));
	}
	
    @Override
	public void setSelectedColor() {
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
		parts[0].draw(x, y, g);
		parts[1].draw(x, y + (int) (30 * times), g);
		parts[2].draw(x, y + (int) (48 * times), g);
		parts[3].draw(x, y + (int) (84 * times), g);
		parts[4].draw(x - (int) (30 * times), y + (int) (41 * times), g);
		parts[5].draw(x + (int) (30 * times), y + (int) (41 * times), g);
		parts[6].draw(x - (int) (56 * times), y + (int) (41 * times), g);
		parts[7].draw(x + (int) (56 * times), y + (int) (41 * times), g);
		parts[8].draw(x - (int) (8 * times), y + (int) (106 * times), g);
		parts[9].draw(x - (int) (8 * times), y + (int) (114 * times), g);
		parts[10].draw(x + (int) (8 * times), y + (int) (106 * times), g);
		parts[11].draw(x + (int) (8 * times), y + (int) (114 * times), g);
		parts[12].draw(x - (int) (8 * times), y + (int) (125 * times), g);
		parts[13].draw(x + (int) (8 * times), y + (int) (125 * times), g);
	}

	public void drawfill(int x, int y, Graphics g) {
		if (color == null) {
			setDefaultColor();
		}else{
			setSelectedColor();
		}
		for (int i = 0; i < parts.length; i++) {
			if (filled = true) {
				parts[i].setFilled(true);
			}
		}
		parts[0].drawfill(x, y, g);
		parts[1].drawfill(x, y + (int) (30 * times), g);
		parts[2].drawfill(x, y + (int) (48 * times), g);
		parts[3].drawfill(x, y + (int) (84 * times), g);
		parts[4].drawfill(x - (int) (30 * times), y + (int) (41 * times), g);
		parts[5].drawfill(x + (int) (30 * times), y + (int) (41 * times), g);
		parts[6].drawfill(x - (int) (56 * times), y + (int) (41 * times), g);
		parts[7].drawfill(x + (int) (56 * times), y + (int) (41 * times), g);
		parts[8].drawfill(x - (int) (8 * times), y + (int) (106 * times), g);
		parts[9].drawfill(x - (int) (8 * times), y + (int) (114 * times), g);
		parts[10].drawfill(x + (int) (8 * times), y + (int) (106 * times), g);
		parts[11].drawfill(x + (int) (8 * times), y + (int) (114 * times), g);
		parts[12].drawfill(x - (int) (11 * times), y + (int) (125 * times), g);
		parts[13].drawfill(x + (int) (11 * times), y + (int) (125 * times), g);
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
		int newWid = (int) (parts[2].getWidth() * times + parts[4].getWidth()
				* times + parts[5].getWidth() * times + parts[6].getWidth()
				* times + parts[7].getWidth() * times);
		return newWid;
	}

	@Override
	public int getHeight() {
		int newHeight = (int) (parts[0].getHeight() * times
				+ parts[1].getHeight() * times + parts[2].getHeight() * times
				+ parts[3].getHeight() * times + parts[8].getHeight() * times
				+ parts[9].getHeight() * times + parts[12].getHeight() * times);
		return newHeight;
	}

	@Override
	public String toString() {
		return "Human";
	}

	@Override
	public Image getImage() {
		Image im = new BufferedImage(getWidth() + 5, getHeight() + 5,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = im.getGraphics();
		if (filled) {
			drawfill(3 + (getWidth() / 2),
					(int) (parts[0].getHeight() * times / 2), g);
		} else {
			draw(3 + (getWidth() / 2),
					(int) (parts[0].getHeight() * times / 2), g);
		}
		return im;
	}

	@Override
	public void setTimes(double t) {
		// TODO 自動生成されたメソッド・スタブ
		times = t;
		for (int i = 0; i < parts.length; i++) {
			parts[i].setTimes(times);
		}
	}

	@Override
	public double getTimes() {
		// TODO 自動生成されたメソッド・スタブ
		return times;
	}

}
