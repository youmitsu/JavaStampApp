package ex01_13k1137;

import java.awt.Color;
import java.awt.Graphics;

public interface Drawable {
	void draw(int x, int y);
	void drawfill(int x, int y);
	void setColor(Color c);
	Color getColor();

}
