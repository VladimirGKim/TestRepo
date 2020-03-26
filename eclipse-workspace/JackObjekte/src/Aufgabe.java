public class Aufgabe {
	// Aufgabe 1
	public Object getAnyObject() {
		ExampleClass obj = new ExampleClass(); 
		return obj;
	}
	
	// Aufgabe 2
	public ExampleClass getExampleClass() {
		ExampleClass obj1 = new ExampleClass();
		return obj1;
	}
	
	// Aufgabe 3 
	public ExampleClass getExampleClass(int number) {
		ExampleClass obj2 = new ExampleClass(number);
		return obj2;
	}
	
	// Aufgabe 4
	public ExampleClass getExampleClass(String string) {
		ExampleClass obj3 = new ExampleClass();
		obj3.setString(string);
		return obj3;
	}
	
	/*
	 * Die main Methode.
	 * Hier koennen Sie ihre Methoden testen.
	 * Natuerlich koennen Sie auch eigene Testfaelle schreiben.
	 */
	public static void main(String[] args) {
		Aufgabe aufgabe = new Aufgabe();
		System.out.println("Ein Objekt: "+aufgabe.getAnyObject());//Hier sollte etwas ausgegeben werden. Egal was, aber nicht null.
		System.out.println("Ein Objekt vom Typ Klasse: "+aufgabe.getExampleClass());//Hier sollte ein Objekt vom Typ ExampleClass ausgegeben werden.
		System.out.println("Ein Objekt vom Typ Klasse mit dem Wert zahl = 42: "+aufgabe.getExampleClass(42));//Hier sollte auch ein Objekt vom Typ ExampleClass ausgegeben werden, diesmal aber mit number = 42
		System.out.println("Ein Objekt vom Typ Klasse mit dem Wert string = \"Hallo Welt!\": "+aufgabe.getExampleClass("Hallo Welt!"));//Hier soll ein Objekt vom Typ ExampleClass ausgegeben werden, wobei string = "Hallo Welt!" ist
	}
}