
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
		money = 10000;
	}

	// Aufgabe 2
	public String ownedCar() {
		String result = ownedCar.getManufacturer() +" "+ ownedCar.getModel();
		return result;
	}

	// Aufgabe 3
	public String favouriteCar() {
		return favouriteCar.getManufacturer() +" "+ favouriteCar.getModel();
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
		return false;
	}

	// Aufgabe 6
	public boolean isEnvious() {
		if(isHappy() == true && ownedCar.getValue()<friend.ownedCar.getValue() || isHappy() == false && 
		   ownedCar.getValue()>=friend.ownedCar.getValue() ) {
			return false;
		}
		return true;
	}

	// Aufgabe 7
	public void repairCar() {
		this.money = money - ownedCar.repair();
	}

	// Aufgabe 8
	public void buyNewCar(Car newCar) {
		int money1 = money + ownedCar.getValue();
		if(money1>= newCar.getValue()) {
			setMoney(money1-newCar.getValue());
			setOwnedCar(newCar);
		} else {
			return;
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
