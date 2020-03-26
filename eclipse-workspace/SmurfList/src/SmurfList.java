public class SmurfList {
	
	public static final int SMURF_MAXIMAL_SIZE = 20;
	public static final int SMURF_MINIMAL_SIZE = 8;

	public SmurfNode head;
	
	public SmurfList(){
		head = null;
	}
	
	public SmurfNode getHead(){
		return head;
	}
	
	/*
	 * BEGINN des zu bearbeitenden Codes
	 */
	
	// Aufgabe1
	public void addSmurf(Smurf smurf){
		if(smurf.getSize() < 8 || smurf.getSize() > 20) {
			return;
		}
		
		SmurfNode newSmurf = new SmurfNode(smurf, null);
		SmurfNode cur = head;
		SmurfNode prev = head;
		if(head == null) {
			head = newSmurf;
			return;
		}
		if(newSmurf.smurf.getSize() < cur.smurf.getSize()) {
			newSmurf.setNext(head);
			head = newSmurf;
			return;
		}
		while(newSmurf.smurf.getSize() >= cur.smurf.getSize() && 
			  cur.getNext() != null) {
			prev = cur;
			cur = cur.getNext();
		}
		if(cur.getNext() == null && 
		   cur.smurf.getSize() < newSmurf.smurf.getSize()) {
			cur.setNext(newSmurf);
		} else {
			newSmurf.setNext(cur);
			prev.setNext(newSmurf);
		}
	}
	
	// Aufgabe 2
	public boolean containsSmurf(Smurf smurf){
		boolean contains = false;
		SmurfNode cur = head;
		while(cur != null) {
			if(smurf == cur.getSmurf()) {
				contains = true;
			}
			cur = cur.getNext();
		}
		return contains;
	}
	
	// Aufgabe 3
	public int smurfPosition(Smurf smurf){
		int counter = 1;
		SmurfNode cur = head;
		if(head == null) {
			return -1;
		}
		while(cur.getNext() != null && cur.getSmurf() != smurf) {
			counter++;
			cur = cur.getNext();
		}
		if(cur.getNext() == null && cur.getSmurf() != smurf) {
			counter = -1;
		}
		return counter;
	}
	
	// Aufgabe 4
	public int smurfPosition(String name){
		int counter = 1;
		SmurfNode cur = head;
		if(head == null) {
			return -1;
		}
		while(cur.getNext() != null && 
			  cur.getSmurf().getName().compareTo(name) != 0) {
			counter++;
			cur = cur.getNext();
		}
		if(cur.getNext() == null && 
				cur.getSmurf().getName().compareTo(name) != 0) {
			counter = -1;
		}
		return counter;
	}
	
	// Aufgabe 5
	public void downsizeSmurfs(int cm){
		SmurfNode cur = head;
		SmurfNode prev = head;
		if(head == null) {
			return;
		}
		if(head.getNext() == null) {
			
		}
		while(cur.getNext() != null) {
			if((cur.getSmurf().getSize()-cm) < SMURF_MINIMAL_SIZE) {
				
			}
		}
	}
	
	// Aufgabe 6
	public void stretchSmurfs(int cm){
		
	}
	
	/*
	 * ENDE des zu bearbeitenden Codes
	 */
	
	
	// Mit dieser Methode koennen Sie die Namen aller Schluempfe in einer
	// Schlumpfliste ausgeben lassen. Sie soll eine Hilfestellung sein um ihre
	// Tests in der "public static void main" zu erleichtern.
	// Den Inhalt einer Schlumpfliste "liste" koennen Sie mit dem Befehl
	//
	//                printSchlumpfListe(liste);
	//
	// auf der Konsole ausgeben lassen.
	public static void printSmurfList(SmurfList slist){
		SmurfNode iterator = slist.getHead();
		while (iterator != null){
			if (iterator.smurf != null){
				System.out.print(iterator.getSmurf().getName() + ", ");
			} else {
				System.out.print("NULL, ");
			}
			iterator = iterator.getNext();
		}
		System.out.println();
	}
	
	/*
	 * Hier kommt ihr Testcode hin
	 */
	public static void main(String[] args) {
		SmurfList myList = new SmurfList();
		
		Smurf smurf1 = new Smurf("smurf1", 5);
		Smurf smurf2 = new Smurf("smurf2", 12);
		Smurf smurf3 = new Smurf("smurf3", 9);
		Smurf smurf4 = new Smurf("smurf4", 14);
		Smurf smurf5 = new Smurf("smurf5", 13);
		Smurf smurf6 = new Smurf("smurf6", 0);
		
		
		SmurfNode node1 = new SmurfNode(smurf1, null);
		SmurfNode node2 = new SmurfNode(smurf2, null);
		SmurfNode node3 = new SmurfNode(smurf3, null);
		SmurfNode node4 = new SmurfNode(smurf4, null);
		SmurfNode node5 = new SmurfNode(smurf5, null);
		SmurfNode node6 = new SmurfNode(smurf6, null);
		
		myList.addSmurf(smurf1);
		myList.addSmurf(smurf2);
		myList.addSmurf(smurf3);
		myList.addSmurf(smurf4);
		myList.addSmurf(smurf5);
		myList.addSmurf(smurf6);
		
		
	}
}