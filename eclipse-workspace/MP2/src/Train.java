public class Train {

	// Kann fuer die Ausgabe verwendet werden
	private static final String LOCOMOTIVE = "<___|o|";

	private Waggon head;

	public int getSize() {
		int size = 0;
		Waggon pointer = head;
		while(pointer != null) {
			size += 1;
			pointer = pointer.getNext();
		}
		return size;
	}

	public int getPassengerCount() {
		int sum = 0;
		Waggon pointer = head;
		while(pointer != null) {
			sum += pointer.getPassengers();
			pointer = pointer.getNext();
		}
		return sum;
	}

	public int getCapacity() {
		int sum = 0;
		Waggon pointer = head;
		while(pointer != null) {
			sum += pointer.getCapacity();
			pointer = pointer.getNext();
		}
		return sum;
	}

	public void appendWaggon(Waggon waggon) {
		
		Waggon pointer = head;
		if(head == null) {
			head = waggon;
		} else {
			while(pointer.getNext()!= null) {
				pointer = pointer.getNext();
			}
			pointer.setNext(waggon);
		}
	}

	public void boardPassengers(int numberOfPassengers) {
		
		int restOfPassengers = numberOfPassengers;
		int freePlaces = 0;
		Waggon pointer = head;
		while(pointer != null && restOfPassengers > 0) {
			freePlaces = pointer.getCapacity() - pointer.getPassengers();
			if(freePlaces >= restOfPassengers) {
				pointer.setPassengers(restOfPassengers+pointer.getPassengers());
				restOfPassengers -= freePlaces;
				pointer = pointer.getNext();
			} else {
				restOfPassengers -= freePlaces;
				pointer.setPassengers(pointer.getPassengers()+freePlaces);
				pointer = pointer.getNext();
			}
		}
		
	}

	public Train uncoupleWaggons(int index) {
		
		if(index < 0 || index >= getSize()) {
			return null;
		} else {
			
			int counter = 1;
			Waggon pointer = this.head;
			Train newTrain = new Train();
			while(counter < index) {
				pointer = pointer.getNext();
				counter++;
			}
			newTrain.head = pointer.getNext();
			pointer.setNext(null);
			
			return newTrain;
		}
		
	}

	public void insertWaggon(Waggon waggon, int index) {
		
		if(index == 0) {
			waggon.setNext(head);
			head = waggon;
		} else
		if(index >= getSize()) {
			appendWaggon(waggon);
		} else {
		
		int counter = 0;
		Waggon pointer = head;
		Waggon prevWaggon = head;

		while(counter < index) {
			prevWaggon = pointer;
			pointer = pointer.getNext();
			counter++;
		} 
		waggon.setNext(pointer);
		prevWaggon.setNext(waggon);

		
	}}

	public void turnOver() {
		
		Waggon prev = null;
		Waggon cur = head;
		Waggon next = head;
		while(cur != null) {
			next = cur.getNext();
			cur.setNext(prev);
			prev = cur;
			cur = next;
		}
		head = prev;
		
	}

	public void removeWaggon(Waggon waggon) {
		
		if(head == null || waggon == null) {
			return;
		} else if(head.equals(waggon)) {
			head = head.getNext() == null ? null : head.getNext();
		} else {
			Waggon curPosition = head.getNext();
			Waggon prevPosition = head;
			while(curPosition != null) {
				if(curPosition.equals(waggon)) {
					if(curPosition.getNext() == null) {
						prevPosition.setNext(null);
						return;
					} else {
						prevPosition.setNext(curPosition.getNext());
						return;
					}
				} else {
					prevPosition = curPosition;
					curPosition = curPosition.getNext();
				}
			}
		}
		

		
		
	}

	public Waggon getWaggonAt(int index) {
		
		int counter = 0;
		Waggon pointer = head;
		if(index >= getSize() || index < 0) {
			return null;
		}
		while(counter < index) {
			pointer = pointer.getNext();
			counter++;
		}
		return pointer;
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
