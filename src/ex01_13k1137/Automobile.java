package ex01_13k1137;

public abstract class Automobile {
	
	int capacity;
	double speed;
	
	public Automobile(int capacity){
		this.capacity = capacity;
		speed = 0;
	}
	
	public abstract void accelerate(double power);
	public abstract void brake(double power);

}
