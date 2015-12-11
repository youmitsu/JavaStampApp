package ex03_13k1137;

//import java.awt.FlowLayout;
//import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;

public class MainClass extends JFrame implements ActionListener,ChangeListener,ItemListener{

	private JMenuBar jmb;
	private JMenu menu_file;
	private JMenu menu_edit;
	private JMenu menu_help;
	private JMenuItem jmi_exit;
	private JMenuItem jmi_zoom;
	private JMenuItem jmi_color;
	private JMenuItem jmi_help;

	ChoosePanel cp;
	PaintSpace ps;
	JScrollPane jsp;
	ZoomWindow zw;
	ColorWindow cw;
	Color[] color;

	public MainClass() {
		setSize(1280, 780);
		setTitle("図形を描けるよ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		zw = new ZoomWindow();
		cw = new ColorWindow();
		
		jmb = new JMenuBar();

		menu_file = new JMenu("ファイル");
		menu_edit = new JMenu("編集");
		menu_help = new JMenu("ヘルプ");

		jmi_exit = new JMenuItem("終了");
		jmi_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,
				InputEvent.CTRL_MASK));
		jmi_exit.addActionListener(this);
		menu_file.add(jmi_exit);
		
		jmi_zoom = new JMenuItem("拡大・縮小");
		jmi_zoom.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,
				InputEvent.CTRL_MASK));
		jmi_zoom.addActionListener(this);
		menu_edit.add(jmi_zoom);
		
		jmi_color = new JMenuItem("色");
		jmi_color.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y,
				InputEvent.CTRL_MASK));
		jmi_color.addActionListener(this);
		menu_edit.add(jmi_color);

		jmi_help = new JMenuItem("助けてもらう");
        jmi_help.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,
				InputEvent.CTRL_MASK));
		jmi_help.addActionListener(this);
		menu_help.add(jmi_help);
		
		jmb.add(menu_file);
		jmb.add(menu_edit);
		jmb.add(menu_help);
		setJMenuBar(jmb);

		setLayout(null);

		cp = new ChoosePanel();
		for (int i = 0; i < cp.button.length; i++) {
			cp.button[i].addActionListener(this);
			zw.slider[i].addChangeListener(this);
			cw.c[i].addItemListener(this);
		}
		color = cp.color;
		jsp = new JScrollPane(cp);
		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		// jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		jsp.setBounds(0, 0, 290, 700);
		add(jsp);

		ps = new PaintSpace();
		ps.setBounds(290, 0, 1010, 780);
		add(ps);
		
	}

	public static void main(String[] args) {
		JFrame f = new MainClass();
		f.setVisible(true);
		JOptionPane.showMessageDialog(null,"注意！\n"
	               +"倍率、色、塗りつぶしの設定を変更した際、ボタンを押さなければ変更は適用されません。");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(jmi_exit)) {
			System.exit(0);
		}
		if(e.getSource().equals(jmi_zoom)){
			zw.setVisible(true);
		}
		if(e.getSource().equals(jmi_color)){
			cw.setVisible(true);
		}
		if(e.getSource().equals(jmi_help)){
			JOptionPane.showMessageDialog(null,"助けてもらえると思ったら大間違いだ！");
		}
		if (e.getSource().equals(cp.button[0])) {
			ps.curObj = new BigCircle();
			ps.curObj.setTimes(zw.value[0]);
			ps.curObj.setFilled(cp.isFilled[0].isSelected());
			ps.curObj.setColor(cw.colors[0]);
		} else if (e.getSource().equals(cp.button[1])) {
			ps.curObj = new SmallCircle();
			ps.curObj.setTimes(zw.value[1]);
			ps.curObj.setFilled(cp.isFilled[1].isSelected());
			ps.curObj.setColor(cw.colors[1]);
		} else if (e.getSource().equals(cp.button[2])) {
			ps.curObj = new BigIsoscelesTriangle();
			ps.curObj.setTimes(zw.value[2]);
			ps.curObj.setFilled(cp.isFilled[2].isSelected());
			ps.curObj.setColor(cw.colors[2]);
		} else if (e.getSource().equals(cp.button[3])) {
			ps.curObj = new SmallIsoscelesTriangle();
			ps.curObj.setTimes(zw.value[3]);
			ps.curObj.setFilled(cp.isFilled[3].isSelected());
			ps.curObj.setColor(cw.colors[3]);
		} else if (e.getSource().equals(cp.button[4])) {
			ps.curObj = new BigSquare();
			ps.curObj.setTimes(zw.value[4]);
			ps.curObj.setFilled(cp.isFilled[4].isSelected());
			ps.curObj.setColor(cw.colors[4]);
		} else if (e.getSource().equals(cp.button[5])) {
			ps.curObj = new SmallSquare();
			ps.curObj.setTimes(zw.value[5]);
			ps.curObj.setFilled(cp.isFilled[5].isSelected());
			ps.curObj.setColor(cw.colors[5]);
		} else if (e.getSource().equals(cp.button[6])) {
			ps.curObj = new BigRectangle();
			ps.curObj.setTimes(zw.value[6]);
			ps.curObj.setFilled(cp.isFilled[6].isSelected());
			ps.curObj.setColor(cw.colors[6]);
		} else if (e.getSource().equals(cp.button[7])) {
			ps.curObj = new SmallRectangle();
			ps.curObj.setTimes(zw.value[7]);
			ps.curObj.setFilled(cp.isFilled[7].isSelected());
			ps.curObj.setColor(cw.colors[7]);
		} else if (e.getSource().equals(cp.button[8])) {
			ps.curObj = new Tree();
			ps.curObj.setTimes(zw.value[8]);
			ps.curObj.setFilled(cp.isFilled[8].isSelected());
			ps.curObj.setColor(cw.colors[8]);
		} else if (e.getSource().equals(cp.button[9])) {
			ps.curObj = new Human();
			ps.curObj.setTimes(zw.value[9]);
			ps.curObj.setFilled(cp.isFilled[9].isSelected());
			ps.curObj.setColor(cw.colors[9]);
		} else if (e.getSource().equals(cp.button[10])) {
			ps.curObj = new Cat();
			ps.curObj.setTimes(zw.value[10]);
			ps.curObj.setFilled(cp.isFilled[10].isSelected());
			ps.curObj.setColor(cw.colors[10]);
		} else if (e.getSource().equals(cp.button[11])) {
			ps.curObj = new Ball();
			ps.curObj.setTimes(zw.value[11]);
			ps.curObj.setFilled(cp.isFilled[11].isSelected());
			ps.curObj.setColor(cw.colors[11]);
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
	//	for(int i = 0; i < cw.c.length;i++){
//		if(ps.curObj.equals(ps.shapes.get(ps.shapes.size()-1))){
//			if(e.getSource().equals(obj))
//			ps.curObj.setColor(cw.colors[i]);
//		}
//	}
	}

	@Override
	public void stateChanged(ChangeEvent e) {

	}

}
