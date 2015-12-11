package ex05_13k1137;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.WindowListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZoomWindow extends JFrame implements ChangeListener,
		ActionListener {
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
	JLabel vl1, vl2, vl3, vl4, vl5, vl6, vl7, vl8, vl9, vl10, vl11, vl12;
	JLabel[] l = { l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12 };
	JLabel[] vl = { vl1, vl2, vl3, vl4, vl5, vl6, vl7, vl8, vl9, vl10, vl11,
			vl12 };
	String[] label = { "Big Circle", "SmallCircle", "Big IsoscelesTriangle",
			"SmallIsoscelesTriangle", "BigSquare", "SmallSquare",
			"Big Rectangle", "SmallRectangle", "Tree", "Human", "Cat", "Ball" };
	JButton b1;

	JPanel p;
	JScrollPane jsp;

	JSlider s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12;
	JSlider[] slider = { s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12 };
	double[] value = new double[slider.length];

	public ZoomWindow() {
		setSize(320, 700);
		setTitle("拡大縮小設定");
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p = new JPanel();
		p.setPreferredSize(new Dimension(350, 900));
		p.setLayout(null);
		b1 = new JButton("OK");
		for (int i = 0; i < slider.length; i++) {
			l[i] = new JLabel(label[i]);
			l[i].setBounds(0, 70 * i, 100, 50);
			p.add(l[i]);
			slider[i] = new JSlider(0, 30, 10);
			slider[i].addChangeListener(this);
			value[i] = slider[i].getValue()*0.1;
			slider[i].setBounds(120, 18 + 70 * i, 120, 20);
			p.add(slider[i]);
			vl[i] = new JLabel("×" + value[i]);
			vl[i].setBounds(250, 15 + 70 * i, 150, 20);
			p.add(vl[i]);
		}
		b1.setBounds(170, 830, 80, 40);
		b1.addActionListener(this);
		p.add(b1);
		jsp = new JScrollPane(p);
		// jsp.setVerticalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);w
		add(jsp);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if (e.getSource().equals(slider[0])) {
			value[0] = slider[0].getValue() * 0.1;
			vl[0].setText("×" + value[0]);
		} else if (e.getSource().equals(slider[1])) {
			value[1] = slider[1].getValue() * 0.1;
			vl[1].setText("×" + value[1]);
		} else if (e.getSource().equals(slider[2])) {
			value[2] = slider[2].getValue() * 0.1;
			vl[2].setText("×" + value[2]);
		} else if (e.getSource().equals(slider[3])) {
			value[3] = slider[3].getValue() * 0.1;
			vl[3].setText("×" + value[3]);
		} else if (e.getSource().equals(slider[4])) {
			value[4] = slider[4].getValue() * 0.1;
			vl[4].setText("×" + value[4]);
		} else if (e.getSource().equals(slider[5])) {
			value[5] = slider[5].getValue() * 0.1;
			vl[5].setText("×" + value[5]);
		} else if (e.getSource().equals(slider[6])) {
			value[6] = slider[6].getValue() * 0.1;
			vl[6].setText("×" + value[6]);
		} else if (e.getSource().equals(slider[7])) {
			value[7] = slider[7].getValue() * 0.1;
			vl[7].setText("×" + value[7]);
		} else if (e.getSource().equals(slider[8])) {
			value[8] = slider[8].getValue() * 0.1;
			vl[8].setText("×" + value[8]);
		} else if (e.getSource().equals(slider[9])) {
			value[9] = slider[9].getValue() * 0.1;
			vl[9].setText("×" + value[9]);
		} else if (e.getSource().equals(slider[10])) {
			value[10] = slider[10].getValue() * 0.1;
			vl[10].setText("×" + value[10]);
		} else if (e.getSource().equals(slider[11])) {
			value[11] = slider[11].getValue() * 0.1;
			vl[11].setText("×" + value[11]);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(b1)) {
			dispose();
		}
	}

}
