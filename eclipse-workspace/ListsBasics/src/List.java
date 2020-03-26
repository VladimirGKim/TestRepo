
public class List {

	private static final String START_LABEL = "|START|";
	public Element head;

	// Aufgabe 1
	public void addElement(Element newElement) {
		if(this.head==null) {
			this.head = newElement;
			this.head.setNext(null);
		} else {
			Element node = this.head;
			while(node.getNext()!=null) {
				node = node.getNext();
			}
			node.setNext(newElement);
		}
	}

	// Aufgabe 2
	public int getSize() {
		int counter = 0;
		Element node = head;
		while(node!=null) {
			node = node.getNext();
			counter++;
		}
		return counter;
	}

	// Aufgabe 3
	public void increase() {
		Element node = head;
		while(node!=null) {
			node.increaseByOne();
			node = node.getNext();
		}
	}

	// Aufgabe 4
	public void deleteElement() {
		if(head==null) {
			return;
		} else {
			head = head.getNext();
		}

	}

	// Methode, die zur Darstellung der Liste dient.
	@Override
	public String toString() {
		
		StringBuilder str = new StringBuilder(START_LABEL);

		Element pointer = head;
		while (pointer != null) {
			str.append("---> ");
			str.append(pointer.getValue());
			pointer = pointer.getNext();
		}

		str.append("---> null");

		return str.toString();
	}
}
