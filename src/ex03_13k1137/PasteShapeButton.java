package ex03_13k1137;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PasteShapeButton extends JPanel implements ActionListener{
	JPanel[] p = new JPanel[8];
    
    Drawable bigCircle, smallCircle, bigIsoscelesTriangle, 
    smallIsoscelesTriangle, bigSquare, smallSquare,
    bigRectangle, smallRectangle;
    Drawable[] objects = {bigCircle, smallCircle, bigIsoscelesTriangle, smallIsoscelesTriangle,
			bigSquare, smallSquare, bigRectangle, smallRectangle};
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JLabel[] l = {l1,l2,l3,l4,l5,l6,l7,l8};
	String[] label = {"Big Circle", "Small Circle", "Big IsoscelesTriangle",
			               "Small IsoscelesTriangle", "BigSquare", "SmallSquare", "Big Rectangle", "SmallRectangle"};
	
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	JButton[] button = {b1,b2,b3,b4,b5,b6,b7,b8};
	Image[] img = new Image[8];
	Image[] newimg = new Image[8];
	int imagesize = 50;
	
	public PasteShapeButton(){
		super();
		setSize(200,700);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		objects[0] = new BigCircle();
		objects[1] = new SmallCircle();
		objects[2] = new BigIsoscelesTriangle(); 
		objects[3] = new SmallIsoscelesTriangle();
		objects[4] = new BigSquare();
		objects[5] = new SmallSquare();
		objects[6] = new BigRectangle();
		objects[7] = new SmallRectangle();        
        
		setLayout(new FlowLayout());
		setLayout(new GridLayout(8,1));
		for(int i = 0; i < p.length; i++){
			p[i] = new JPanel();
			p[i].setLayout(new FlowLayout());
			p[i].setLayout(new GridLayout(1,2));
			l[i] = new JLabel(label[i]);
			p[i].add(l[i]);
			img[i] = objects[i].getImage();
			newimg[i] = img[i].getScaledInstance(imagesize, imagesize,
					java.awt.Image.SCALE_SMOOTH);
			button[i] = new JButton(new ImageIcon(newimg[i]));
			button[i].addActionListener(this);
			p[i].add(button[i]);
			add(p[i]);
		}
	}
	
//	public static void main(String[] args){
//		JFrame f = new PasteShapeButton();
//		f.setVisible(true);
//	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource().equals(button[0])){
		    System.out.println(bigCircle);	
		}	
	//	System.out.println();
	}


}
