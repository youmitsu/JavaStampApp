package ex02_13k1137;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelTest extends JFrame implements ActionListener{
	
	JPanel p1, p2;
	JButton b1, b2, b3, b4;
	
	PanelTest(){
		setSize(200, 200);
		setTitle("GUIプログラミング");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1 = new JPanel();
		p2 = new JPanel();
		b1 = new JButton("b1");
		b2 = new JButton("b2");
		b3 = new JButton("b3");
		b4 = new JButton("b4");
		b1.addActionListener(this);
		setLayout(new FlowLayout());
		p1.setLayout(new GridLayout(2,1));
		p2.setLayout(new GridLayout(1,2));
		p1.add(b1);
		p1.add(b2);
		p2.add(b3);
		p2.add(b4);
		
		add(p1);
		add(p2);
	}
	
	public static void main(String[] args){
		JFrame f = new PanelTest();
		f.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println(e.getActionCommand()+"が押された");
	}

}
