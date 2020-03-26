public class Queue {
	QueueNode first;
	QueueNode last;
	
	public void Warteschlange(){
		first	= null;
		last	= null;
	}
	/*
	 * BEGINN des zu bearbeitenden Codes
	 */
	// Aufgabe 1
	public void push(int number){
		QueueNode node = new QueueNode(number, null);
		if(first==null) {
			first = node;
			last=first;
		} 
		else {
			last = first;
			while(last.getNext()!=null) {
				last = last.getNext();
			}
			last.setNext(node);
			last = last.getNext();
		}

	}
	// Aufgabe 2
	public int pop(){
		int temp;
		if(first==null) {
			temp = Integer.MIN_VALUE;
		} 
		else if(first.getNext()==null) {
			temp = first.getNumber();
			first = null;
			last = null;
		}
		else {
			temp = first.getNumber();
			first = first.getNext();
		}
		return temp;

	}
	// Aufgabe 3
	public int length(){
		int length = 0;
		last = first;
		while(last != null) {
			length++;
			last = last.getNext();
		}
		return length;
	}
	// Aufgabe 4
	public int sum(){
		int sum = 0;
		last = first;
		while(last != null) {
			sum += last.getNumber();
			last = last.getNext();
		}
		return sum;

	}
	/*
	 * ENDE des zu bearbeitenden Codes
	 */
	/*
	 * Testen Sie hier Ihre Implementierung.
	 */
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.push(4);		// Inhalt der Warteschlange: (4)
		queue.push(17);		// Inhalt der Warteschlange: (4, 17)
		queue.pop();		// ...                       (17)
		queue.push(33);		// 							 (17, 33)
		queue.push(-13);	//							 (17, 33, -13)
		queue.pop();		//							 (33, -13)
		System.out.println("Erwartete Länge der Warteschlange: 2");
		System.out.println("Tatsächliche Länge:               " + queue.length());
		System.out.println();
		System.out.println("Erwartete Summe über der Warteschlange: 20");
		System.out.println("Tatsächliche Summe:                     " + queue.sum());
	}
}
