public class Quadrat {
	
	/*
	 * Diese Methode soll ein Quadrat aus * zurueckgeben in Form eines Strings mit der angegebenen Kantenlaenge.
	 * Diese Quadrat soll dann zum Beispiel wie folgt aus sehen:
	 * *****
	 * *****
	 * *****
	 * *****
	 * *****
	 * Also eine Reihe aus kantenlaenge *, dann ein Zeilenumbruch, dann eine weitere Reihe, ...
	 * Am Ende des Strings steht KEIN Zeilenumbruch mehr.
	 * Das Zeichen fuer einen Zeilenumbruch ist dieses hier: \n (ein \ gefolgt von einem n)
	 */
	public static String macheQuadrat(int kantenlaenge)
	{
		return null;
	}
	
	/*
	 * Beispielmethode
	 * So sieht die korrekte Loesung fuer kantenlaenge = 2 aus.
	 */
	public static String beispiel()
	{
		return "**\n**";
	}
	
	/*
	 * Die main Methode. Hier kannst du deine Methode testen. Du kannst auch eigene Testfaelle schreiben.
	 */
	public static void main(String[] args) {
		System.out.println(beispiel());
		System.out.println();
		System.out.println(macheQuadrat(1));
		System.out.println();
		System.out.println(macheQuadrat(2));
		System.out.println();
		System.out.println(macheQuadrat(3));
		System.out.println();
		System.out.println(macheQuadrat(4));
		System.out.println();
		System.out.println(macheQuadrat(5));
		System.out.println();
	}
}
