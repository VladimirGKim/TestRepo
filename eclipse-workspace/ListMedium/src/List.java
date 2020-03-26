public class List {
	private static final String START_LABEL = "|START|";
	public Element head;

	// Aufgabe 1
	public void addElement(Element newElement, int position) {
		if(head == null) {
			head = newElement;
		} 
		else {
			Element prev = head;
			if(position == 1) {
				newElement.setNext(head);
				head = newElement;
			} 
			else if(position <= getSize()+1 && position > 1) {
				int counter = 1;
				while(counter < position-1) {
					prev = prev.getNext();
					counter++;
				}
				newElement.setNext(prev.getNext());
				prev.setNext(newElement);
			}
		}
	}

	// Aufgabe 2
	public int getPosition(Element wanted) {
		int counter = 1;
		Element cur = head;
		while(cur != null && !cur.getName().equals(wanted.getName()) && 
				cur.getValue() != wanted.getValue()) {
			counter++;
			cur = cur.getNext();
		}
		if(cur == null || head == null) {
			return 0;
		}
		return counter;
	}

	// Aufgabe 3
	public String getName(int position) {

		if(head == null || position < 0 || position > getSize()) {
			return null;
		}
		else {
			Element cur = head;
			int counter = 1;
		while(counter < position) {
			cur = cur.getNext();
			counter++;
		}
		return cur.getName();
		}
	}

	// Aufgabe 4
	public void deleteElement() {
		Element cur = head;
		int counter = 1;
		if(head == null || head.getNext() == null) {
			head = null;
		} else {
		while(counter < getSize()-1) {
			cur = cur.getNext();
			counter++;
		}
		cur.setNext(null);
		}
	}

	// ------------- HILFSMETHODEN ---------------

	// Methode zum Ausgeben der Anzahl der Elemente in der Liste.
	public int getSize() {
		int count = 0;
		Element pointer = head;
		while (pointer != null) {
			count++;
			pointer = pointer.getNext();
		}
		return count;
	}

	// Methode zum Einfuegen eines neuen Elementes am Ende der Liste.
	public void addElement(Element newElement) {
		if (head == null) {
			head = newElement;
		} else {
			Element pointer = this.head;
			while (pointer.getNext() != null) {
				pointer = pointer.getNext();
			}
			pointer.setNext(newElement);
		}
	}

	// Methode, die die komplette Liste löscht.
	public void clearList() {
		head = null;
	}

	// Methode, die zur Darstellung der Liste dient.
	@Override
	public String toString() {

		StringBuilder str = new StringBuilder(START_LABEL);
		Element pointer = head;
		while (pointer != null) {
			str.append("---> ");
			str.append(pointer.getName());
			pointer = pointer.getNext();
		}

		str.append("---> null");
		return str.toString();
	}
}