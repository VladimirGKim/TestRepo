public class Pyramide {
	
	/*
	 * Diese Methode soll eine Pyramide aus * zurueckgeben.
	 * Dabei wird mit n die breite der untersten Reihe angegeben.
	 * Als n wird immer eine ungerade Zahl angegeben.
	 * Eine Pyramide sieht wie folgt aus:
	 *   *
	 *  ***
	 * *****
	 * Diese wird so erstellt, dass in der obersten Zeile 1 * ist, in der darunterliegenden 3 *,...
	 * in der (n/2+1)ten Zeile (die unterste Zeile) kommmen n *.
	 * Vor dem ersten * in jeder Zeile muessen noch Leerzeichen eingesetzt werden,
	 * damit die Sterne jeder Zeile in der Mitte stehen. Nach dem letzten Stern in
	 * jeder Zeile kommt ein Zeilenumbruch, dann beginnt die n�chste Zeile.
	 * Nach der letzten Zeile folgt KEIN Zeilenumbruch mehr.
	 * Das Zeichen Zeilenumbruch ist das Folgende: \n
	 */
	public static String machePyramide(int n) {
		String p = "";
		String star = "**";
		int hight = n/2+1;
		for(int i=0; i<=hight; i++) {			
			
			for(int k=0; k<i*2-1; k++) {
				for(int j=0; j<hight-1;j++) {
					p = p + " ";
				}
				p = p + "*";
			
			}
			p = p + "\n";
		}
		return p;
	}
	
	/*
	 * Beispielmethode.
	 * So sieht die Loesung fuer n=5 aus.
	 */
	public static String beispiel() {
		return "  *\n ***\n*****";
	}
	
	//In der Main Methode kannst du deine eigene Methode testen. Du kannst natuerlich auch eigene Testfaelle schreiben.
	public static void main(String[] args) {
		System.out.println(beispiel());
		System.out.println();
		System.out.println(machePyramide(1));
		System.out.println();
		System.out.println(machePyramide(3));
		System.out.println();
		System.out.println(machePyramide(5));
		System.out.println();
		System.out.println(machePyramide(7));
	}
}