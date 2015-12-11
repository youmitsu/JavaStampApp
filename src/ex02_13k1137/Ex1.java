package ex02_13k1137;

import javax.swing.JFrame;

public class Ex1 extends JFrame{
	
	Ex1(){
		setSize(200,200);
		setTitle("GUIプログラミング");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		JFrame f = new Ex1();
		f.setVisible(true);
	}

}
