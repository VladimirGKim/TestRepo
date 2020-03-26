//--------------------- Aufgabe 8 ---------------------
public class PKW extends Car implements PassengerTransportable
{

	@Override
	public int getNumberOfSeats() {
		// TODO Auto-generated method stub
		int randomNumberOfSeats = Math.abs((int)(Math.random()*10) + 1);
		return randomNumberOfSeats;
	}

	@Override
	public int getNumberOfOccupants() {
		// TODO Auto-generated method stub
		int randomNumberOfOccupants = Math.abs((int)(Math.random()*getNumberOfSeats()) + 1);
		return randomNumberOfOccupants;
	}
	
}