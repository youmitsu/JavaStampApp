package ex02_13k1137;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PaintCircle extends JPanel{
	int x,y,radius;
//	boolean isDraw = false;
	
	public PaintCircle(){
		super();
		setBackground(Color.white);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.black);
	    g.drawOval(x-15, y-37, radius, radius);
	}
	
	public void click(int x, int y, int radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
//		isDraw = true;
		repaint();
	}
	
	

}
