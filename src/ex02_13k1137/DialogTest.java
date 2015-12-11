package ex02_13k1137;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class DialogTest extends JFrame implements ActionListener{
	JButton b;
	JLabel l;
	JDialog d;
	public DialogTest(){
		setSize(200 ,200);
		setTitle("GUIプログラミング");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b = new JButton("ダイアログを出します");
		b.addActionListener(this);
		add(b);
		
		d = new JDialog(this, "ダイアログです", true);
		d.setBounds(10, 10, 150, 100);
		l = new JLabel("こんにちは", SwingConstants.CENTER);
		d.add(l);
	}
	public static void main(String[] args){
		JFrame f = new DialogTest();
		f.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0){
		d.setVisible(true);
	}

}
