package ex05_13k1137;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class PaintSpace extends JPanel implements MouseListener {
	Drawable curObj;
	ArrayList<ShapeObject> shapes = new ArrayList<ShapeObject>();

	PaintSpace() {
		super();
		setBackground(Color.white);
		addMouseListener(this);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < shapes.size(); i++) {
			if (shapes.get(i).d.getFilled()) {
				shapes.get(i).d.drawfill(shapes.get(i).p.x, shapes.get(i).p.y,
						g);

			} else {
				shapes.get(i).d.draw(shapes.get(i).p.x, shapes.get(i).p.y, g);
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (curObj == null) {
		} else {
			Point p = e.getPoint();
			shapes.add(new ShapeObject(curObj, p));
			repaint();
		}
		curObj = null;
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

	private class ShapeObject {
		Drawable d;
		Point p;

		public ShapeObject(Drawable d, Point p) {
			this.d = d;
			this.p = p;
		}
	}

}
