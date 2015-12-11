package ex02_13k1137;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class ClickChecker extends JFrame implements MouseListener{
	
	public ClickChecker(){
		setSize(200,200);
		setTitle("GUIプログラミング");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(this);
	}
	
	public void mouseEntered(MouseEvent e){
		
	}
	
	public void mouseExited(MouseEvent e){
		
	}
	
	public void mousePressed(MouseEvent e){
		
	}
	
	public void mouseReleased(MouseEvent e){
		
	}
	
	public void mouseClicked(MouseEvent e){
		System.out.println("クリックされました");
	}
	public static void main(String[] args){
		JFrame f = new ClickChecker();
		f.setVisible(true);
	}

}
