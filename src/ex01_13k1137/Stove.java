package ex01_13k1137;

public class Stove implements Refuelable{
	double oilAmount;
	public Stove(){
		oilAmount = 0;
	}
	
	@Override
	public void refuel(double amount){
		oilAmount += amount;
		System.out.println("ストーブが"+amount+"リットル給油した");
	}
	
	public void heat(){
		
	}

}
