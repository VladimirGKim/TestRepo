
public class MeanPerson {

	private Car			favouriteCar;	// Lieblingsauto der Person
	private Car			ownedCar;		// Eigenes Auto der Person
	private MeanPerson	friend;			// "Freund" der Person
	private int			money; 			// Kontostand der Person in Euro
	
	//===================================
	// BEGINN des zu bearbeitenden Codes
	//===================================
	

	// Aufgabe 1
	public MeanPerson() {
		this.money = 10000;
	}

	// Aufgabe 2
	public String ownedCar() {
		return ownedCar.getManufacturer() + " " + ownedCar.getModel();
	}

	// Aufgabe 3
	public String favouriteCar() {
		return favouriteCar.getManufacturer() + " " + favouriteCar.getModel();
	}

	// Aufgabe 4
	public String friendsCar() {
		return friend.ownedCar();
	}

	// Aufgabe 5
	public boolean isHappy() {
		if(ownedCar.equals(favouriteCar) && ownedCar.isDamaged() == false) {
			return true;
		}
		else {
			return false;
		}
	}

	// Aufgabe 6
	public boolean isEnvious() {
		if(isHappy() == true) {
			return false;
		}
		else {
			if(ownedCar.getValue() < friend.getOwnedCar().getValue()) {
				return true;
			}
			else {
				return false;
			}
		}
	}

	// Aufgabe 7
	public boolean secretlyLaughsOverFriendsCar() {
		if(friend.getOwnedCar().getManufacturer().equalsIgnoreCase("Ludolf") == true 
				||friend.getOwnedCar().isDamaged() == true) {
			return true;
		}
		else {
			return false;
		}
	}

	// Aufgabe 8
	public void repairCar() {
		ownedCar.repair(); 
		money -= ownedCar.getRepairCost(); 
	}

	// Aufgabe 9
	public void buyNewCar(Car newCar) {
		if(ownedCar != null) {
			setMoney(money + ownedCar.getValue());
			if(newCar.getValue() <= getMoney()) {
				ownedCar = newCar;
				setMoney(money - newCar.getValue());
			}
		}
		else {
			if(newCar.getValue() <= getMoney()) {
				ownedCar = newCar;
				setMoney(money - newCar.getValue());
			}
		}
	}

	
	//=================================
	// Ende des zu bearbeitenden Codes
	//=================================
	
	// Getter und Setter fuer die Klasse Person.
	// Die Getter und Setter sind bereits vollstaendig implementiert
	// und sollen fuer die Aufgabe NICHT veraendert werden!	
	public void setFavouriteCar(Car newFavouriteCar){
		favouriteCar = newFavouriteCar;
	}
	
	public Car getFavouriteCar(){
		return favouriteCar;
	}
	
	public void setOwnedCar(Car newOwnedCar){
		ownedCar = newOwnedCar;
	}
	
	public Car getOwnedCar(){
		return ownedCar;
	}
	
	public void setFriend(MeanPerson newFriend){
		friend = newFriend;
	}
	
	public MeanPerson getFriend(){
		return friend;
	}
	
	public void setMoney(int newMoney){
		money = newMoney;
	}
	
	public int getMoney(){
		return money;
	}
		
	// Testen Sie hier ob ihre Methoden wie gewuenscht funktionieren!	
	public static void main(String[] args) {
		MeanPerson	person	= new MeanPerson();
		MeanPerson	friend	= new MeanPerson();
		Car			car1	= new Car();
		Car			car2	= new Car();
	}

}
