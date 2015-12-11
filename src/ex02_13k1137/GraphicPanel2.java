package ex02_13k1137;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GraphicPanel2 extends JPanel{
	private int x = 10,y = 10, width = 10;
	
	public GraphicPanel2(){
		super();
		setBackground(Color.white);
	}
	
	@Override
	public void paintComponent(Graphics g){
    	super.paintComponent(g);
		g.drawOval(x,y,width,width);
	}
	
	public void moveOval(int w, int h){
		x = (int)(Math.random() * w);
		y = (int)(Math.random() * h);
		repaint();
	}

}
