package ex02_13k1137;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import java.awt.Dimension;

import ex01_13k1137.SmallCircle;

public class ExerciseFrame2 extends JFrame implements MouseListener{
	
	int x, y;
	PaintCircle gp;
	
	public ExerciseFrame2(){
		setSize(200,200);
		setTitle("GUIプログラミング");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addMouseListener(this);
		gp = new PaintCircle();
		gp.setPreferredSize(new Dimension(200,200));
		add(gp);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Point p = e.getPoint();
		x = p.x;
		y = p.y;
//		System.out.println(x+","+y+"をクリックしました");
		SmallCircle c = new SmallCircle();
		c.draw(x, y);
		gp.click(x, y, 15);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
	public static void main(String[] args){
		JFrame f = new ExerciseFrame2();
		f.setVisible(true);
	}

}
