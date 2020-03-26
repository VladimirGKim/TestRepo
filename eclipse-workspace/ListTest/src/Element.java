
public class Element {
	private Document value;
	private Element next;
	
	public Element(Document value) {
		this.value = value;
	}
	
	public Element getNext() {
		return next;
	}
	
	public void setNext(Element n) {
		this.next = n;
	}
	
	public Document getValue() {
		return value;
	}
}
