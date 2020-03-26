
public class List {
	private Element firstElement;
	
	public void add(int index, Document d) {
		Element element = new Element(d);
		if(index == 0) {
			element.setNext(firstElement);
			firstElement = element;
		} else if(index > 0) {
			Element prev = getElementAt(index - 1);
			if(prev != null) {
				element.setNext(prev.getNext());
			}
		}
	}
	
	private Element getElementAt(int index) {
		if(index < 0) {
			return null;
		}
		int curPos = 0;
		Element element = firstElement;
		while(curPos < index && element != null) {
			element = element.getNext();
			curPos = curPos + 1;
		}
		return element;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List liste = new List();
		liste.add(0, new Document("b"));
		liste.add(0, new Document("a"));
		liste.add(2, new Document("c"));
		liste.add(0, new Document("e"));
		liste.add(1, new Document("d"));
		
		Element el = liste.firstElement;
		while(liste.firstElement.getNext() != null) {
			System.out.println(el.getValue().toString());
			el = el.getNext();
			
		}

	}

}
