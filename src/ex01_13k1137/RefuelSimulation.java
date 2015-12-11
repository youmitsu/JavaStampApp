package ex01_13k1137;

import java.util.Random;

public class RefuelSimulation {
	GasStation gs;
	Refuelable[] customers = new Refuelable[10];
	Random random;
	
	public RefuelSimulation(){
		gs = new GasStation();
		random = new Random();
		int type;
		for(int i = 0; i < customers.length; i++){
			type = random.nextInt(3);
			switch(type){
			case 0:
				customers[i] = new PassengerCar();
				break;
			case 1:
				customers[i] = new Bike();
				break;
			default:
				customers[i] = new Stove();
			}
		}
	}

	public void simulate(){
		for(int i = 0; i<customers.length;i++){
			gs.refuel(customers[i], (double)(random.nextInt(99)+1));
		}
	}
	
	public static void main(String[] args){
		RefuelSimulation rs = new RefuelSimulation();
		rs.simulate();
	}
}
