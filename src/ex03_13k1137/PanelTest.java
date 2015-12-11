package ex03_13k1137;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PanelTest extends JFrame implements ActionListener{
	
	JButton b1, b2;
	
	PanelTest(){
		setSize(200,200);
		setTitle("ボタンテスト");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1 = new JButton("b1");
		b2 = new JButton("b2");
		b1.addActionListener(this);
		b2.addActionListener(this);
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
	}
	
	public static void main(String[] args){
		JFrame f = new PanelTest();
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource().equals(b1)){
			System.out.println("b1が押された");
		}else if(e.getActionCommand().equals("b2")){
			System.out.println("b2が押された");
		}else{
			System.out.println("なぞのイベントが発生しました");
		}
	}
}
