package ex02_13k1137;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	GraphicPanel gp;
	
	public MainFrame(){
		setSize(200,200);
		setTitle("GUIプログラミング");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		gp = new GraphicPanel();
		gp.setPreferredSize(new Dimension(100,100));
		add(gp);
	}
	
	public static void main(String[] args){
		JFrame f = new MainFrame();
		f.setVisible(true);
	}

}
