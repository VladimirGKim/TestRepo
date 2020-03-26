//	-------------------- Aufgabe 1 --------------------
// 1 a)
public class Animal {
	
	private int numberOfLegs;
	private boolean pet;
	
	
	public Animal (int legs, boolean pet) {
		numberOfLegs = legs;
		this.pet=pet;
	}
	
	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	protected void setNumberOfLegs(int legs) {
		this.numberOfLegs = legs;
	}

	public boolean isPet() {
		return pet;
	}

	protected void setPet(boolean pet) {
		this.pet = pet;
	}
	// zu bearbeitender Bereich Fuer Aufgabe 1 a) und b)

	
	

}
