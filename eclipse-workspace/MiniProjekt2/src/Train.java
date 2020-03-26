public class Train {

	// Kann fuer die Ausgabe verwendet werden
	private static final String LOCOMOTIVE = "<___|o|";

	private Waggon head;

	public int getSize() {
		int result = 0;
		Waggon pointer = head;
		while(pointer != null) {
			result++;
			pointer = pointer.getNext();
		}
		return result;
	}

	public int getPassengerCount() {
		int sum = 0;
		Waggon pointer = head;
		while(pointer != null) {
			sum = sum + pointer.getPassengers();
			pointer = pointer.getNext();
		}
		return sum;
	}

	public int getCapacity() {
		int sum = 0;
		Waggon pointer = head;
		while(pointer != null) {
			sum = sum + pointer.getCapacity();
			pointer = pointer.getNext();
		}
		return sum;
	}

	public void appendWaggon(Waggon waggon) {
		Waggon pointer = head;
		if(head == null) {
			head = waggon;
		} else {

		while(pointer.getNext() != null) {
			pointer = pointer.getNext();
		}
		pointer.setNext(waggon);
		}

	}

	public void boardPassengers(int numberOfPassengers) {
//		Waggon pointer = head;
//		int number = numberOfPassengers;
//		if(head == null) {
//			return;
//		}
//		while(pointer != null || number > 0) {
//			if(pointer == null) {
//				return;
//			}
//			int temp = pointer.getCapacity() - pointer.getPassengers();
//			if(temp == 0) {
//				pointer = pointer.getNext();
//			} 
//			else {
//				if(number <= temp) {
//					pointer.setPassengers(pointer.getPassengers()+number);
//					return;
//				}
//				else {
//					pointer.setPassengers(pointer.getPassengers()+temp);
//					number -= temp;
//					pointer = pointer.getNext();
//				}
//			}
//		}
		
		Waggon aktuellerWaggon = head;
		// Solange noch Waggons vorhanden sind und Passsgiere warten
		while(aktuellerWaggon != null && numberOfPassengers > 0) {
			//Wenn weniger Passagiere warten als Platz im aktuellen Waggon ist
			//dann lasse ich die Passagiere einsteigen und bin fertig
			
			//ich muss wissen wie viele Plätze frei sinf
			int freiePlaetze = aktuellerWaggon.getCapacity()-aktuellerWaggon.getPassengers();
			if(numberOfPassengers <= freiePlaetze) {
				aktuellerWaggon.setPassengers(numberOfPassengers + aktuellerWaggon.getPassengers());
				return; 
				//  oder numberOfPassengers = 0; oder numberOfPassengers -= freiePlaetze; 
				
			}
			//Wenn mehr Passagiere warten als Platz ist
			//dann fühle ich die freien Pätze auf und gehe zum nächsten Waggon
			else {
				aktuellerWaggon.setPassengers(aktuellerWaggon.getCapacity());
				numberOfPassengers -= freiePlaetze; 
			}
			aktuellerWaggon = aktuellerWaggon.getNext();
		}
	}

	public Train uncoupleWaggons(int index) {
		Train newTrain = new Train();
		int counter = 1;
		Waggon pointer = head;
		while(counter < index) {
			counter++;
			pointer = pointer.getNext();
		}
		newTrain.head = pointer.getNext();
		pointer.setNext(null);
		return newTrain;
	}

	public void insertWaggon(Waggon waggon, int index) {
		if(head == null) {
			head = waggon;
			return;
		}
		if(index < 0 || waggon == null) {
			return;
		} 
		if(index == 0) {
			waggon.setNext(head);
			head = waggon;
			return;
		}
		if(index > 0 && index < getSize()) {
			int counter = 0;
			Waggon cur = head;
			Waggon prev = head;
			while(counter < index) {
				prev = cur;
				cur = cur.getNext();
				counter++;
			}
			waggon.setNext(cur);
			prev.setNext(waggon);
		}
		else {
			appendWaggon(waggon);
		}
	}

	public void turnOver() {
		Waggon next = head;
		Waggon prev = null;
		Waggon cur = head;
		while(cur != null) {
			next = next.getNext();
			cur.setNext(prev);
			prev = cur;
			cur = next;
		}
		head = prev;
	}

	public void removeWaggon(Waggon waggon) {
		if(head == null || waggon == null) {
			return;
		}
		if(waggon.equals(head)) {
			head = head.getNext();
		}
		Waggon pointer = head;
		Waggon prev = head;
		while(pointer != null) {
			if(waggon.equals(pointer)) {
				prev.setNext(pointer.getNext());
				return;
			}
			prev = pointer;
			pointer = pointer.getNext();
		}
	}

	public Waggon getWaggonAt(int index) {

		int counter = 0;
		Waggon pointer = head;
		if(index >= 0 && index < getSize()) {
			while(counter != index) {
				pointer = pointer.getNext();
				counter++;
			}
			return pointer;
		}
		return null;
	}

	@Override
	public String toString() {
		if (getSize() == 0) {
			return LOCOMOTIVE;
		}

		StringBuilder str = new StringBuilder(LOCOMOTIVE);

		Waggon pointer = head;
		while (pointer != null) {
			str.append(" <---> ");
			str.append(pointer.getName());
			pointer = pointer.getNext();
		}

		return str.toString();
	}
	
	public Waggon getHead() {
		return head;
	}

}
