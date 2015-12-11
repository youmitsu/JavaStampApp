package ex05_13k1137;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Choice;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColorWindow extends JFrame implements ActionListener, ItemListener {
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
	JLabel[] l = { l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12 };
	String[] label = { "Big Circle", "SmallCircle", "Big IsoscelesTriangle",
			"SmallIsoscelesTriangle", "BigSquare", "SmallSquare",
			"Big Rectangle", "SmallRectangle", "Tree", "Human", "Cat", "Ball" };

	JButton b1;
	JPanel p;
	JScrollPane jsp;

	Color c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12;
	Color[] colors = { c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12 };
	Choice ch1, ch2, ch3, ch4, ch5, ch6, ch7, ch8, ch9, ch10, ch11, ch12;
	Choice[] c = { ch1, ch2, ch3, ch4, ch5, ch6, ch7, ch8, ch9, ch10, ch11,
			ch12 };

	ColorWindow() {
		setSize(320, 700);
		setTitle("色設定");

		p = new JPanel();
		p.setPreferredSize(new Dimension(350, 900));
		p.setLayout(null);
		b1 = new JButton("OK");
		setDefaultColor();
		for (int i = 0; i < colors.length; i++) {
			l[i] = new JLabel(label[i]);
			l[i].setBounds(0, 70 * i, 100, 50);
			p.add(l[i]);
			c[i] = new Choice();
			if(i >= 8){
				c[i].add("Default");
			}
			c[i].add("Black");
			c[i].add("Blue");
			c[i].add("Cyan");
			c[i].add("Gray");
			c[i].add("Green");
			c[i].add("Red");
			c[i].add("Yellow");
			c[i].add("Pink");
			c[i].addItemListener(this);
			c[i].setBounds(120, 10 + 70 * i, 100, 50);
			p.add(c[i]);
		}
		b1.setBounds(170, 830, 80, 40);
		b1.addActionListener(this);
		p.add(b1);
		jsp = new JScrollPane(p);

		add(jsp);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(b1)) {
			dispose();
		}

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
	    if (e.getSource().equals(c[0])) {
			colors[0] = choicedColor(c[0]);
		}else if (e.getSource().equals(c[1])) {
			colors[1] = choicedColor(c[1]);
		}else if (e.getSource().equals(c[2])) {
			colors[2] = choicedColor(c[2]);
		}else if (e.getSource().equals(c[3])) {
			colors[3] = choicedColor(c[3]);
		}else if (e.getSource().equals(c[4])) {
			colors[4] = choicedColor(c[4]);
		}else if (e.getSource().equals(c[5])) {
			colors[5] = choicedColor(c[5]);
		}else if (e.getSource().equals(c[6])) {
			colors[6] = choicedColor(c[6]);
		}else if (e.getSource().equals(c[7])) {
			colors[7] = choicedColor(c[7]);
		}else if (e.getSource().equals(c[8])) {
			colors[8] = choicedColor(c[8]);
		}else if (e.getSource().equals(c[9])) {
			colors[9] = choicedColor(c[9]);
		}else if (e.getSource().equals(c[10])) {
			colors[10] = choicedColor(c[10]);
		}else if (e.getSource().equals(c[11])) {
			colors[11] = choicedColor(c[11]);
		}else if (e.getSource().equals(c[12])) {
			colors[12] = choicedColor(c[12]);
		}
	}
	
	void setDefaultColor(){
		for(int i = 0; i < 8;i++){
			colors[i] = Color.black;
		}
		colors[8] = null;
		colors[9] = null;
		colors[10] = null;
		colors[11] = null;
		
	}

	Color choicedColor(Choice c) {
		if(c.getSelectedItem().equals("Default")){
			return null;
		}else if (c.getSelectedItem().equals("Black")) {
			return Color.black;
		} else if (c.getSelectedItem().equals("Blue")) {
			return Color.blue;
		} else if (c.getSelectedItem().equals("Cyan")) {
			return Color.cyan;
		} else if (c.getSelectedItem().equals("Gray")) {
			return Color.gray;
		} else if (c.getSelectedItem().equals("Green")) {
			return Color.green;
		} else if (c.getSelectedItem().equals("Red")) {
			return Color.red;
		} else if (c.getSelectedItem().equals("Yellow")) {
			return Color.yellow;
		} else {
			return Color.pink;
		}
	}

}
