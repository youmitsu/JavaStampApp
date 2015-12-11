package ex03_13k1137;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class Cat implements CompoundDrawable{
	Drawable[] parts;
	Color color;
	Boolean filled;
	double times;
	
	public Cat(){
		parts = new Drawable[7];
		color = null;
		filled = true;
		times = 1;
		
		parts[0] = new SmallIsoscelesTriangle();  //左耳
		parts[1] = new SmallIsoscelesTriangle();  //右耳
		parts[2] = new BigSquare();               //顔
		parts[3] = new SmallCircle();             //左目
		parts[4] = new SmallCircle();            //右目
		parts[5] = new SmallRectangle();         //口
		parts[6] = new BigCircle();   //胴体
	}
	
	@Override
	public void setDefaultColor(){
		parts[0].setColor(new Color(255,215,0));
		parts[1].setColor(new Color(255,215,0));
		parts[2].setColor(new Color(255,215,0));
		parts[3].setColor(Color.black);
		parts[4].setColor(Color.black);
		parts[5].setColor(Color.red);
		parts[6].setColor(new Color(255,215,0));		
	}
	
	@Override
	public void setColor(Color c){
		color = c;
	}
	
	@Override
	public void setSelectedColor(){
		for (int i = 0; i < parts.length; i++) {
			parts[i].setColor(color);
		}
	}
	
	@Override
	public Color getColor(){
		return color;
	}
	
	@Override
	public void draw(int x, int y, Graphics g){
		if (color == null) {
			setDefaultColor();
		}else{
			setSelectedColor();
		}
		parts[0].draw(x-(int)(9*times), y-(int)(26*times), g);
		parts[1].draw(x+(int)(9*times), y-(int)(26*times), g);
		parts[2].draw(x, y, g);
		parts[3].draw(x-(int)(9*times), y-(int)(9*times), g);
		parts[4].draw(x+(int)(9*times), y-(int)(9*times), g);
		parts[5].draw(x, y+(int)(9*times), g);
		parts[6].draw(x, y+(int)(35*times), g);
	}
	
	@Override
	public void drawfill(int x, int y, Graphics g){
		if (color == null) {
			setDefaultColor();
		}else{
			setSelectedColor();
		}
		parts[0].drawfill(x-(int)(9*times), y-(int)(26*times), g);
		parts[1].drawfill(x+(int)(9*times), y-(int)(26*times), g);
		parts[2].drawfill(x, y, g);
		parts[3].drawfill(x-(int)(9*times), y-(int)(9*times), g);
		parts[4].drawfill(x+(int)(9*times), y-(int)(9*times), g);
		parts[5].drawfill(x, y+(int)(9*times), g);
		parts[6].drawfill(x, y+(int)(35*times), g);
	}
	
	@Override
	public void setFilled(Boolean b){
		filled = b;
	}
	
	@Override
	public Boolean getFilled(){
		return filled;
	}
	
	@Override
	public Drawable[] getParts(){
		return parts;
	}
	
	@Override
	public int getWidth(){
		return (int)(parts[6].getWidth()*times);
	}
	
	@Override
	public int getHeight(){
		int height = (int)(parts[0].getHeight()*times+
				parts[2].getHeight()*times+parts[6].getHeight()*times);
		return height;
	}
	
	@Override 
	public String toString(){
		return "Cat";
	}
	
	@Override
	public Image getImage(){
		Image im = new BufferedImage(getWidth()+5,getHeight()+5
				,BufferedImage.TYPE_INT_ARGB);
		Graphics g = im.getGraphics();
		if(filled){
			drawfill(3+(getWidth()/2),getHeight()/2-10,g);
		}else{
			draw(3+(getWidth()/2),getHeight()/2-10,g);
		}
		return im;
	}

	@Override
	public void setTimes(double t) {
		// TODO 自動生成されたメソッド・スタブ
		times = t;
		for(int i = 0; i < parts.length; i++){
			parts[i].setTimes(times);
		}
	}

	@Override
	public double getTimes() {
		// TODO 自動生成されたメソッド・スタブ
		return times;
	}

}
