public class IntArrays {
	
	//===================================
	// BEGINN des zu bearbeitenden Codes
	//===================================
	
	// Aufagbe 1
	public static double average(int[] array) {
		double durchschnitt = 0;
		for(int i=0; i<array.length; i++) {
			durchschnitt += array[i];
		}
		durchschnitt /=array.length; 
		return durchschnitt;
	}
	
	// Aufagbe 2
	public static double median(int[] array) {
		double median = 0;
		int hilfsVariable = 0;
		if(array.length%2==1) {
			hilfsVariable = array.length/2;
			median = array[hilfsVariable];
		} else {
			median = ((double)array[array.length/2] + (double)array[array.length/2-1])/2;
		}
		return median;

	}
	
	//=================================
	// ENDE des zu bearbeitenden Codes
	//=================================
	
	/*
	 * Die Main Methode. Du kannst dir hier verschiedene Testfaelle ausdenken und testen.
	 */
	public static void main(String[] args) {
		int[] test = {3, 4, 5, 9, 12, 16, 56};
		System.out.println("Beim Aufruf der Methode 'public static double durchschnitt(int[] array)' mit dem Parameter test sollte herauskommen:"
				+ "\n 15"
				+ "\n Bei dir kommt heraus:"
				+ average(test));
		System.out.println("Beim Aufruf der Methode 'public static double median(int[] array)' mit dem Parameter test sollte herauskommen:"
				+ "\n 9"
				+ "\n Bei dir kommt heraus:"
				+ median(test));
	}
}