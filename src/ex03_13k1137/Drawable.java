package ex03_13k1137;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public interface Drawable {
	void draw(int x, int y, Graphics g);
	void drawfill(int x, int y, Graphics g);
	void setColor(Color c);
	Color getColor();
	void setFilled(Boolean b);
	Boolean getFilled();
	Image getImage();
	int getWidth();
	int getHeight();
	void setTimes(double t);
	double getTimes();
}
