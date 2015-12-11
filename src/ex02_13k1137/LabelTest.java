package ex02_13k1137;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelTest extends JFrame{
	
	ImageIcon c = new ImageIcon(getClass().getResource("1.png"));
	JLabel l0 = new JLabel("テスト", SwingConstants.LEFT);
	JLabel l1 = new JLabel(c, SwingConstants.CENTER);
	JLabel l2 = new JLabel("テスト", c, SwingConstants.RIGHT);
	
	LabelTest(){
		setSize(200, 200);
		setTitle("GUIプログラミング");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		add(l0);
		add(l1);
		add(l2);
	}
	
	public static void main(String[] args){
		JFrame f = new LabelTest();
		f.setVisible(true);
	}

}
