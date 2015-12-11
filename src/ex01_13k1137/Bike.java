package ex01_13k1137;

public class Bike implements Refuelable{
	double speed;
	double gasAmount;
	Tire[] tire = new Tire[2];
	
	public Bike(){
		speed = 0;
		gasAmount = 0;
	}
	
	public void accelerate(double power){
		speed += power * 100;
	}
	
	public void brake(double power){
		speed -= power * 100;
	}
	
	@Override
	public void refuel(double amount){
		gasAmount += amount;
		System.out.println("バイクが"+amount+"リットル給油した");
	}

}
