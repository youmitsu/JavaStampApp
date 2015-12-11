package ex01_13k1137;

public class ShapeTest {
	Shape[] shapes = new Shape[8];
	Rectangle r1, r2;
	Square s1, s2;
	IsoscelesTriangle i1, i2;
	Circle c1, c2;
	
	public ShapeTest(){
		r1 = new SmallRectangle();
		r2 = new BigRectangle();
		s1 = new SmallSquare();
		s2 = new BigSquare();
		i1 = new SmallIsoscelesTriangle();
		i2 = new BigIsoscelesTriangle();
		c1 = new SmallCircle();
		c2 = new BigCircle();
		shapes[0] = r1;
		shapes[1] = r2;
		shapes[2] = s1;
		shapes[3] = s2;
		shapes[4] = i1;
		shapes[5] = i2;
		shapes[6] = c1;
		shapes[7] = c2;
	}
	
	public void start(){
		for(int i = 0; i < shapes.length;i++){
			System.out.println(shapes[i]);
		}
	}
	
	public static void main(String[] args){
		ShapeTest st = new ShapeTest();
		st.start();
	}

}
