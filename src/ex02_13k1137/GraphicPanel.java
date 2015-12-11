package ex02_13k1137;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GraphicPanel extends JPanel{
	public GraphicPanel(){
		super();
		setBackground(Color.white);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawString("Test1", 0, 10);
		g.drawRect(50,50,49,49);
		g.fillOval(20,20,20,20);
	}

}
