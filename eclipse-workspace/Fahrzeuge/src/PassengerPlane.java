//--------------------- Aufgabe 7 ---------------------
public class PassengerPlane extends Airplane implements PassengerTransportable
{

	@Override
	public int getNumberOfSeats() {
		// TODO Auto-generated method stub		
		int randomNumberOfSeats = Math.abs((int)(Math.random())+1);
		return randomNumberOfSeats;
	}

	@Override
	public int getNumberOfOccupants() {
		// TODO Auto-generated method stub
		int randomNumberOfOccupants = Math.abs((int)(Math.random()*getNumberOfSeats()) + 1);
		return randomNumberOfOccupants;
	}
	
}