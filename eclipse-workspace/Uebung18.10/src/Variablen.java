
public class Variablen {

	public static void main(String[] args) {
		
		multiplikation();
		
		variablenUebergabe();
		
		nulldivision();
	}

	public static void multiplikation() {
		int a; //Deklaration
		a = 10; //Intialisierung
		int b = 10; //Deklaration und Intialisierung in einem Schritt
		int c = a*b;
		System.out.println("Wert von a: "+a+"Wert von b: "+b+"a*b ergibt c: "+c);
		
		
		b = c; //neuzuweisung eines Wertes auf eine bereits vorhandene Variable
		System.out.println("Wert von b: "+b+"Wert von c: "+c);
	}
	
	public static void variablenUebergabe() {
		int eingabe =1;		
		System.out.println("Variablenwert von eingabe vor Aufruf der Methode ist "+eingabe);
		
		aussenInnen(eingabe);
		
		System.out.println("Variablenwert von eingabe nach dem Aufruf der Methode ist "+eingabe);
	}
	
	public static void aussenInnen(int eingabe) {
		eingabe = eingabe *2;
		System.out.println("Variablenwert von eingabe in der Methode ist "+eingabe);
	}
	
	public static void nulldivision() {
		int i =0;
		int a =1;
		a = a/i;
	}
}
