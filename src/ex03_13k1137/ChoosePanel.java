package ex03_13k1137;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ChoosePanel extends JPanel implements ChangeListener {
	Drawable bigCircle,smallCircle, bigIsoscelesTriangle,smallIsoscelesTriangle, 
	bigSquare,smallSquare, bigRectangle,smallRectangle, tree, human, cat, ball;
	Drawable[] objects = { bigCircle, smallCircle, bigIsoscelesTriangle,smallIsoscelesTriangle,
			bigSquare,smallSquare,bigRectangle,smallRectangle, tree, human, cat, ball };
    
    JScrollPane jsp;
	JPanel p1, p2, p3;
	
	JLabel a1,a2,a3;

	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
	JLabel[] l = { l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12 };
	String[] label = { "Big Circle", "SmallCircle","Big IsoscelesTriangle",
			"SmallIsoscelesTriangle","BigSquare","SmallSquare",
			"Big Rectangle","SmallRectangle", "Tree", "Human", "Cat", "Ball" };

	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9,b10,b11,b12;
	JButton[] button = { b1, b2, b3, b4, b5, b6, b7, b8, b9,b10, b11, b12 };
	Image[] img = new Image[button.length];
	Image[] newimg = new Image[button.length];
	
	Color[] color = new Color[button.length];
	
	JRadioButton f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12;
	JRadioButton[] isFilled = {f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12};
	
	int imagesize = 60;

	public ChoosePanel() {
		super();
		setSize(400, 0);
		setPreferredSize(new Dimension(290, 880));
		a1 = new JLabel("名前");
		a2 = new JLabel("ボタン");
		a3 = new JLabel("塗りつぶし");
		
		objects[0] = new BigCircle();
		objects[1] = new SmallCircle();
		objects[2] = new BigIsoscelesTriangle();
		objects[3] = new SmallIsoscelesTriangle();
		objects[4] = new BigSquare();
		objects[5] = new SmallSquare();
		objects[6] = new BigRectangle();
		objects[7] = new SmallRectangle();
		objects[8] = new Tree();
		objects[9] = new Human();
		objects[10] = new Cat();
		objects[11] = new Ball();

		setLayout(null);
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p1.setLayout(null);
		p2.setLayout(null);
		p3.setLayout(null);
		p1.setBounds(0, 0, 100, 880);
		p2.setBounds(100, 0, 70, 880);
		p3.setBounds(170,0,100,880);
        a1.setBounds(10,10,50,20);
        a2.setBounds(10,10,50,20);
        a3.setBounds(20,10,80,20);
		p1.add(a1);
		p2.add(a2);
		p3.add(a3);
		for (int i = 0; i < label.length; i++) {
			l[i] = new JLabel(label[i]);
			l[i].setBounds(0, 40 + 70 * i, 100, 50);
			p1.add(l[i]);
			img[i] = objects[i].getImage();
			newimg[i] = img[i].getScaledInstance(imagesize, imagesize,
					java.awt.Image.SCALE_SMOOTH);
			button[i] = new JButton(new ImageIcon(newimg[i]));
			button[i].setBounds(0, 40 + 70 * i, 60, 60);
			p2.add(button[i]);
			color[i] = objects[i].getColor();
			isFilled[i] = new JRadioButton("",objects[i].getFilled());
			isFilled[i].setBounds(40, 40 + 70*i, 50,50);
			p3.add(isFilled[i]);
		}
		add(p1);
		add(p2);
		add(p3);
	}

	@Override
	public void stateChanged(ChangeEvent e) {

	}

}