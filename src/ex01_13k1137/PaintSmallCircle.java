package ex01_13k1137;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PaintSmallCircle extends JPanel{
	int x,y;
	
	public PaintSmallCircle(int x, int y){
		super();
		this.x = x;
		this.y = y;
		setBackground(Color.white);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawOval(x, y, 15, 15);
	}

}
