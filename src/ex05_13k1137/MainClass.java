package ex05_13k1137;

//import java.awt.FlowLayout;
//import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.FileDialog;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.KeyStroke;

public class MainClass extends JFrame implements ActionListener,
		ChangeListener, ItemListener {

	private JMenuBar jmb;
	private JMenu menu_file;
	private JMenu menu_edit;
	private JMenu menu_help;
	private JMenuItem jmi_exit;
	private JMenuItem jmi_new;
	private JMenuItem jmi_zoom;
	private JMenuItem jmi_color;
	private JMenuItem jmi_help;
	private JMenuItem jmi_capture;
	private JMenuItem jmi_undo;
	private JMenuItem jmi_redo;
	
	ChoosePanel cp;
	PaintSpace ps;
	JScrollPane jsp;
	ZoomWindow zw;
	ColorWindow cw;
	Color[] color;

	public MainClass() {
		setSize(1370, 780);
		setTitle("Stamp!!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		zw = new ZoomWindow();
		cw = new ColorWindow();

		jmb = new JMenuBar();

		menu_file = new JMenu("ファイル");
		menu_edit = new JMenu("編集");
		menu_help = new JMenu("ヘルプ");

//---------------メニューバー「ファイル」の要素-------------------------//
	
		jmi_exit = new JMenuItem("終了");
		jmi_exit.addActionListener(this);
		menu_file.add(jmi_exit);

		jmi_new = new JMenuItem("画面のクリア");
		jmi_new.addActionListener(this);
		menu_file.add(jmi_new);

		jmi_capture = new JMenuItem("名前を付けて保存");
		jmi_capture.addActionListener(this);
		menu_file.add(jmi_capture);
		
		jmi_undo = new JMenuItem("元に戻す");
		jmi_undo.addActionListener(this);
		jmi_undo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,
				InputEvent.CTRL_MASK));
		menu_file.add(jmi_undo);
		
		jmi_redo = new JMenuItem("やり直す");
		jmi_redo.addActionListener(this);
		jmi_redo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,
				InputEvent.CTRL_MASK));
		menu_file.add(jmi_redo);
		
//----------------メニューバー「編集」の要素---------------------------//		

		jmi_zoom = new JMenuItem("拡大・縮小");
		jmi_zoom.addActionListener(this);
		menu_edit.add(jmi_zoom);

		jmi_color = new JMenuItem("色");
		jmi_color.addActionListener(this);
		menu_edit.add(jmi_color);
		
//----------------メニューバー「ヘルプ」の要素----------------------------//
		jmi_help = new JMenuItem("ヘルプ");
		jmi_help.addActionListener(this);
		menu_help.add(jmi_help);		
//----------------------------------------------------------------//
		jmb.add(menu_file);
		jmb.add(menu_edit);
		jmb.add(menu_help);
		setJMenuBar(jmb);

		setLayout(null);

		cp = new ChoosePanel();
		for (int i = 0; i < cp.button.length; i++) {
			cp.button[i].addActionListener(this);
		}
		color = cp.color;
		jsp = new JScrollPane(cp);
		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		// jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		jsp.setBounds(0, 0, 290, 700);
		add(jsp);

		ps = new PaintSpace();
		ps.setBounds(290, 0, 1080, 780);
		add(ps);

	}

	public static void main(String[] args) {
		JFrame f = new MainClass();
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(jmi_exit)) {
			System.exit(0);
		}
		if(e.getSource().equals(jmi_redo)){
			ps.redo();
		}
		if(e.getSource().equals(jmi_undo)){
			ps.undo();
		}
		if (e.getSource().equals(jmi_capture)) {
			try {
				
				int w = ps.getWidth();
				int h = ps.getHeight();
				BufferedImage image = new BufferedImage(w, h,
						BufferedImage.TYPE_INT_RGB);
				Graphics g2 = image.createGraphics();
				ps.paint(g2);
				g2.dispose();

				FileOutputStream fo = new FileOutputStream(this.writeFile());
				ImageIO.write(image, "jpeg", fo);
				fo.close();
			} catch (IOException err) {
				err.getMessage();
			}
		}
		if (e.getSource().equals(jmi_new)) {
			ps.curObj = null;
			ps.shapes.clear();
			ps.repaint();
		}
		if (e.getSource().equals(jmi_zoom)) {
			zw.setVisible(true);
		}
		if (e.getSource().equals(jmi_color)) {
			cw.setVisible(true);
		}
		if (e.getSource().equals(jmi_help)) {
			Desktop desktop = Desktop.getDesktop();
			String uriString = "http://docs.oracle.com/javase/jp/6/api/";
			try{
				URI uri = new URI(uriString);
				desktop.browse(uri);
			}catch(URISyntaxException err){
				err.printStackTrace();
			}catch(IOException err){
				err.printStackTrace();
			}
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
	}

	@Override
	public void stateChanged(ChangeEvent e) {

	}
	
	String writeFile(){
		FileDialog fd = new FileDialog(new JFrame() ,"保存", FileDialog.SAVE);
		fd.setFile("test.jpg");
		fd.setVisible(true);
		String fullpath = fd.getDirectory() + fd.getFile();
		fd.dispose();
		return fullpath;
	}

}
