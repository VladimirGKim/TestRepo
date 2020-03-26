/*
 * Diese Klasse dient nur als Referenz und darf nicht veraendert werden
 */
public class ExampleClass
{
	private int number;//Eine Zahl.
	private String string;//Eine Zeichenkette.
	
	public ExampleClass()//Parameterloser Konstruktor, setzt number auf 0
	{
		number = 0;
	}
	
	public ExampleClass(int number)//Konstruktor mit einem Parameter, setzt number auf den uebergebenen Wert
	{
		this.number = number;
	}

	//---Getter und Setter Methoden---
	
	public int getNumber()//Der Wert von number wird zurueckgegeben
	{
		return number;
	}

	public void setNumber(int number)//Der Wert von number wird neu gesetzt
	{
		this.number = number;
	}

	public String getString()//Der Wert von string wird zurueckgegeben
	{
		return string;
	}

	public void setString(String string)//Der Wert von String wird neu gesetzt
	{
		this.string = string;
	}
	
	public String toString()//Gibt einen String zurueck, der die beiden Werte von zahl und string enthaelt.
	{
		String rueckgabe = "Objekt von ExampleClass mit den folgenden Werten: ";
		rueckgabe = rueckgabe + "number = ";
		rueckgabe = rueckgabe + number;
		rueckgabe = rueckgabe + ", String = ";
		rueckgabe = rueckgabe + "\"";
		rueckgabe = rueckgabe + string;
		rueckgabe = rueckgabe + "\"";
		rueckgabe = rueckgabe + ".";
		return rueckgabe;
	}
}
