public class IntList {

	// Das erste Element der Liste.
	private IntListElement first;

	/*
	 * BEGINN des zu bearbeitenden Codes
	 */

	// Aufgabe 1
	public void append(int number) {
		IntListElement newNode = new IntListElement();
		newNode.setNumber(number);

		if(first == null) {
			first = newNode;
			return;
		}
		IntListElement cur = first;
		IntListElement prev = first;
		while(cur != null && newNode.getNumber() >= cur.getNumber()) {
			prev = cur;
			cur = cur.getNext();
		}
		if(cur == null) {
			prev.setNext(newNode);
		} else if(newNode.getNumber() < cur.getNumber()) {
			if(cur == first) {
				newNode.setNext(cur);
				first = newNode;
			} else {
				newNode.setNext(cur);
				prev.setNext(newNode);
			}
		}
	}

	// Aufgabe 2
	public int size() {
		int counter = 0;
		IntListElement newNode = first;
		while(newNode != null) {
			newNode = newNode.getNext();
			counter++;
		}
		return counter;
	}

	// Aufgabe 3
	public int get(int index) {
		int counter = 0;
		int result = 0;
		IntListElement pointer = first;
		if(index >= size() || index < 0) {
			return counter;
		} else {
			while(counter < index && pointer != null) {
				pointer = pointer.getNext();
				counter++;
			}
			result = result + pointer.getNumber();
			return result;
		}
		
	}

	// Aufgabe 4
	public void reverse() {
		IntListElement prev = null;
		IntListElement cur = first;
		IntListElement next = null;
		while(cur != null) {
			next = cur.getNext();
			cur.setNext(prev);
			prev = cur;
			cur = next;
		} first = prev;

	}

	/*
	 * ENDE des zu bearbeitenden Codes
	 */

	public static void main(String[] args) {
		IntList l = new IntList();
		l.append(10);
		l.append(20);
		l.append(42);
		l.append(-10);
		l.append(30);
		System.out.println("So sieht die Liste aus: " + l);
		System.out.println("Das Element an Index 0: " + l.get(0));
		System.out.println("Das Element an Index -10 (Gibt es nicht, sollte also 0 sein): " + l.get(-10));
		System.out.println("Das Element an Index 100 (Gibt es nicht, sollte also 0 sein): " + l.get(100));
		System.out.println("Das Element an Index 2: " + l.get(2));
		System.out.println("Die Liste hat " + l.size() + " Elemente.");
		l.reverse();
		System.out.println("Liste wurde gedreht");
		System.out.println("Nun sieht die Liste so aus: " + l);
	}

	public String toString() {
		String liste = "first --> ";
		IntListElement element = first;
		while (element != null) {
			liste = liste + element.getNumber();
			liste = liste + " --> ";
			element = element.getNext();
		}
		liste = liste + "null";
		return liste;
	}
}