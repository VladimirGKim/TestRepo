
public class Workshop {
	
	public int money;
	public Car[] cars;
	public int repairedCarsPerDay;
	private Car toRepairCar;
	
	//===================================
	// BEGINN des zu bearbeitenden Codes
	//===================================
	
	// Aufgabe 1
	public Workshop(int capacity, int speed){
		cars = new Car [capacity];
		repairedCarsPerDay = speed;
		money = 1000;
		
	}

	
	// Aufgabe 2
	public boolean acceptCar(Car car){
		for(int i=0; i<cars.length; i++) {
			if(cars[i]==null && car.isDamaged() == true) {
				cars[i] = car;
				return true;
			}
		}
		return false;
	}
	
			
	// Aufgabe 3
	public void nextDay(){
		for(int i=0; i<repairedCarsPerDay; i++) {
			money = money - toRepairCar.repair();
			retrieveCar(toRepairCar);
			cars[i] = null;
		}
	}
	
	
	// Aufgabe 4
	public int retrieveCar(Car car){
		return -1;
	}
	
	//=================================
	// ENDE des zu bearbeitenden Codes
	//=================================
		
	public int getMoney(){
		return money;
	}
		
	public static void main(String[] args) {
		// Hier kommt ihr Testcode hin
	}

}
