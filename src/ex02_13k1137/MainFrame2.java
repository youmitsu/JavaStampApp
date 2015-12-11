package ex02_13k1137;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame2 extends JFrame implements ActionListener{
	GraphicPanel2 gp;
	JButton b = new JButton("move");
	int length = 200;
	
	public MainFrame2(){
		setSize(length, length);
		setTitle("GUIプログラミング");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		gp = new GraphicPanel2();
		add(gp);
		b.addActionListener(this);
		add(b);
	}
	
	public static void main(String[] args){
		JFrame f = new MainFrame2();
		f.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		gp.moveOval(length,  length / 2);
	}

}
 