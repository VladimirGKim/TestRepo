public class CarDealer {
	
	/*
	 * Diese Methode soll den Preis fuer eine uebergebene Fahrzeugkonfiguration ermitteln.
	 * Hierzu muessen sie int preis um die entsprechenden Betraege erhoehen.
	 * Mittels if-Anweisungen sollten sie ueberpruefen, welche Option jeweils gewaehlt worden ist. 
	 * Um einen Parameter mit dem Typ char auf einen Wert zu pruefen muessen sie ihn mit dem entsprechenden
	 * Buchstaben vergleichen. Hierzu werden einzelne Anfuehrungszeichen (links neben der Enter-Taste)
	 * verwaendet. Beispielweise: (scheinwerfer == 'x') wuerde wahr sein, wenn vorher char scheinwerfer = 'x'; 
	 * gesetzt wurde. 
	 * 
	 * Preistabelle in Euro:
	 *  Motor	Preis		Dach			 Preis		Extras		Preis	Schaltung	Preis
	 *	90ps	10.000		n Normale			0		Klima		500		m Manuell	 375
	 *	110ps	12.500		s Schiebedach	1.500		Navi		500		a Automatik	2222
	 *	130ps	17.000		c Cabrio		4.000		Garantie	500	
	 */
	public static int carConfig(int ps, char schaltung, char dach, int extras) {
		int preis = 0;
		//Beginn des zu bearbeitenden Bereichs
		if(ps == 90) {
			preis = preis + 10000;
		} else if(ps == 110) {
			preis = preis + 12500;
		} else {
			preis = preis + 17000;
		}
		
		if (schaltung == 'm' && ps == 90 || schaltung == 'a' && ps == 90) {
			preis = preis + 375;
		} else if(schaltung == 'm' && ps == 110 || schaltung == 'a' && ps == 110) {
			preis = preis + 375;
		} else {
			preis = preis + 2222;
		}
		
		if(dach == 's') {
			preis = preis + 1500; 
		} else if(dach == 'c') {
			preis = preis + 4000;
		} else {
			preis = preis + 0;
		}
		
		if(extras == 1) {
			preis = preis +500;
		} else if(extras == 2) {
			preis = preis + 1000;
		} else if (extras == 3){
			preis = preis + 1500;
		}
		//Ende des zu bearbeitenden Bereichs
		return preis;
	}
	
	// Mit der Main-Methode koennen sie ihre Methode testen.
	// Sie koennen sich zudem weitere Testfaelle ausdenken.
	public static void main (String[] args) {
		System.out.println("Hier sehen sie die Ergebnisse ihrer Methode carConfig:");
		System.out.println("Ihr Preis fuer die Konfiguration eines Cabrios mit 110ps und Klimaanlage betraegt: " +carConfig(110, 'm', 'c', 1));
		System.out.println("Erwarteter Wert: 17375");
		System.out.println("Ihr Preis fuer die Konfiguration eines Autos mit 90ps, Navi und Klimaanlage betraegt: " +carConfig(90, 'm', 'n', 2));
		System.out.println("Erwarteter Wert: 11375");
		System.out.println("Ihr Preis fuer die Konfiguration eines Autos mit 90ps, Navi und Klimaanlage betraegt: " +carConfig(130, 'a', 'n', 2));
		System.out.println("Erwarteter Wert: 20222");
	}
}