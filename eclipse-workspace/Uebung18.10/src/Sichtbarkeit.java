
public class Sichtbarkeit {

	public static void main(String[] args) {
		int x=5;//Eclipse zeigt bei Variablen dennen nur ein Wert zugewiesen wird, dieser aber nirgendwo weiter verwendet wird eine Warnung an.
		
		nichtSichtbar();
		
		eineKaputteMethode();
	}
	
	public static void nichtSichtbar() {
//		if(x==5) {
//			System.out.println("x ist 5");
//		}
	}
	
	public static int eineKaputteMethode(){
		/*
		int x
		System.out.println("x hat den wert: "+x);
		x= 1;
		if(x=5) { 
			int y = 10;
		}
		System.out.println(y);
		
		if(x==x) {
			 int x = 15;
		}
		System.out.println("Die Funktion sollte 15 zurueckgeben, ihre Funktion liefert jedoch "+x);
		return x;
		x = 20;
		return x;
		*/
		return 1;		
	}
	

}
