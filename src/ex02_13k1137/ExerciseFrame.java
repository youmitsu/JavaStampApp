package ex02_13k1137;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExerciseFrame extends JFrame implements ActionListener{
	
	JPanel p1,p2;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	JLabel l1;
	
	ExerciseFrame(){
		setSize(250,200);
		setTitle("ロック解除システム");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1 = new JPanel();
		b1 = new JButton("7");
		b2 = new JButton("8");
		b3 = new JButton("9");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("1");
		b8 = new JButton("2");
		b9 = new JButton("3");
		b10 = new JButton("0");
		b11 = new JButton("クリア");
		b12 = new JButton("決定");
		b1.addActionListener(this);
		b2.addActionListener(this);
		setLayout(new FlowLayout());
		p1.setLayout(new GridLayout(4,3));
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		p1.add(b6);
		p1.add(b7);
		p1.add(b8);
		p1.add(b9);
		p1.add(b10);
		p1.add(b11);
		p1.add(b12);
		
		p2 = new JPanel();
		l1 = new JLabel("4桁の番号を入力");
		p2.setLayout(new GridLayout(1,2));
		p2.add(l1);
		
		setLayout(new GridLayout(2,1));
		add(p2);
		add(p1);
	}
	
	public static void main(String[] args){
		JFrame f = new ExerciseFrame();
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		int cmd = e.getID();
		System.out.println(cmd);
	}

}
