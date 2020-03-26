public class CheckNumbers {
	

	// Aufgabe 1
	public static boolean checkEven(int number)
	{
		if(number%2==0) {
			return true;
		}
		return false;//Dieses Return Statement ist zu bearbeiten.
	}
	
	// Aufgabe 2
	public static boolean checkOdd(int number)
	{
		if(number%2==1) {
			return true;
		}
		return false;//Dieses Return Statement ist zu bearbeiten.
	}
	
	//In der Main Methode werden verschiedene Testfaelle getestet. Sie koennen sich aber auch eigene ausdenken und testen
	public static void main(String[] args) {
		System.out.println(checkEven(42));//Sollte true zurueckgeben
		System.out.println(checkEven(27));//Sollte false zurueckgeben
		System.out.println(checkEven(28));//Sollte true zurueckgeben
		System.out.println(checkOdd(42));//Sollte false zurueckgeben
		System.out.println(checkOdd(27));//Sollte true zurueckgeben
		System.out.println(checkOdd(28));//Sollte false zurueckgeben
	}
}
