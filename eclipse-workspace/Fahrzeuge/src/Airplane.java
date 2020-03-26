//--------------------- Aufgabe 4 ---------------------
public class Airplane extends Vehicle implements Airworthy, Driveable
{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getNumberOfWheels() {
		// TODO Auto-generated method stub
		int randomNumber = (int)(Math.random()*40) +3;
		return randomNumber;
	}
	
}