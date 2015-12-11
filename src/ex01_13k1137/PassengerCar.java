package ex01_13k1137;

public class PassengerCar extends Automobile implements Refuelable{
	double gasAmount;
	Tire[] tires = new Tire[4];
	
	public PassengerCar(){
		super(5);
		gasAmount = 0;
	}
	
	@Override
	public void accelerate(double power){
		speed += power * 100;
	}
	
	@Override
	public void brake(double power){
		speed -= power * 100;
	}
	
	@Override
	public void refuel(double amount){
		gasAmount += amount;
		System.out.println("乗用車が"+amount+"リットル給油した");
	}

}
