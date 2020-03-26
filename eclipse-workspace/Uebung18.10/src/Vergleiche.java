
public class Vergleiche {

	public static void main(String[] args) {
		vergleiche1();
		
		vergleiche2();
		
		vergleiche3();
	}

	public static void vergleiche1() {
		//Ein Abfrage auf Gleichheit von zwei Variablen
		int aepfel = 5;
		int birnen = 10;
		if(aepfel==birnen) 
			System.out.println("Es sind gleich viele Äpfel und Birnen");
		else
			System.out.println("Es sind nicht gleich viele Äpfel und Birnen");
	}
	
	public static void vergleiche2() {
		int aepfel = 5;
		int birnen = 10;
		//Eine Abfrage auf Ungleichheit von zwei Variablen
		if(aepfel!=birnen)
		System.out.println("Es sind nicht gleich viele Äpfel und Birnen");
		//Einrueckung hilft der Uebersicht
		else if(aepfel>birnen)
		System.out.println("Es sind mehr Äpfel als Birnen");
		else
		System.out.println("Es sind mehr Birnen als Äpfel");
	}
	
	public static void vergleiche3() {
		int aepfel = 5;
		int birnen = 10;
		//Klammerung
		if(aepfel>birnen)
			birnen -=5;
			aepfel +=5;
		System.out.println("Aepfel: "+aepfel);
		System.out.println("Birnen: "+birnen);		
	}
}
