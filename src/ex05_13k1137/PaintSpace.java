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

	// public static boolean isRedo;
	Drawable preObj;
	Drawable curObj;
	ArrayList<ShapeObject> shapes = new ArrayList<ShapeObject>();
	ArrayList<ShapeObject> redoShapes = new ArrayList<ShapeObject>();

	PaintSpace() {
		super();
		setBackground(Color.white);
		addMouseListener(this);
		// isRedo = false;
	}

	public void undo() {
		if (shapes.isEmpty()) {
		} else {
			redoShapes.add(shapes.get(shapes.size() - 1));
			shapes.remove(shapes.size() - 1);
			repaint();
		}
	}

	public void redo() {
		if (redoShapes.isEmpty()) {
		} else {
			shapes.add(redoShapes.get(redoShapes.size() - 1));
			redoShapes.remove(redoShapes.size() - 1);
			repaint();
		}
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
		if (redoShapes != null) {
			redoShapes.clear();
		}
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
