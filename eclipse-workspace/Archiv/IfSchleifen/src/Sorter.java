import java.util.Arrays;

public class Sorter {

	/*
	 * Diese Methode bekommt ein int[] uebergeben und soll dieses sortieren.
	 * Dabei soll aber nur eine Kopie bearbeitet werden, das uebergebene Array soll
	 * seine Elemente behalten. Die sortierte Kopie wird dann zurueckgegeben.
	 * Hierbei sollen die Zahlen in aufsteigender Reihenfolge sortiert sein.
	 * Beispiel: sort({10,5,42,17,108}) --> {5,10,17,42,108}
	 */
	public int[] sort(int[] toSort)
	{
			int newArray [] = new int[toSort.length];
		
		for(int i=0; i<newArray.length; i++) {
			if(toSort[i]<toSort[i+1]) {
				newArray[i] = toSort[i];
				newArray[i+1] = toSort[i+1];
			}else {
				newArray[i] = toSort[i+1];
				newArray[i+1] = toSort[i];
			}
		}
				
		return newArray;
	}
	
	/*
	 * Diese Methode soll das uebergebene Array auch sortieren, allerdings soll diesmal direkt das Array
	 * sortiert werden und keine Kopie angelegt werden. Entsprechend hat diese Methode auch
	 * keinen Rueckgabewert.
	 * Beispiel:
	 * int[] a = new int[]{10,5,42,17,108};
	 * sort2(a);
	 * --> a ist jetzt {5,10,17,42,108}
	 */
	public void sort2(int[] toSort)
	{
		int temp = 0;
		for(int i=0; i<toSort.length; i++) {
			for(int j=1; j<toSort.length-i; j++) {
				if(toSort[j]<toSort[j-1]) {
					temp = toSort[j-1];
					toSort[j-1] = toSort[j];
					toSort[j] = temp;
				}
			}}
	}
	
	/*
	 * Die Main Methode zum Testen deiner Methoden.
	 */
	public static void main(String[] args) {
		int[] toSort = new int[]{10,5,42,17,108};
		Sorter sort = new Sorter();
		System.out.println("Das folgende Array wird sortiert: "+Arrays.toString(toSort));
		System.out.println("Das Ergebnis: "+Arrays.toString(sort.sort(toSort)));
		System.out.println("Das folgende Array wird sortiert: "+Arrays.toString(toSort));
		sort.sort2(toSort);
		System.out.println("Das Ergebnis: "+Arrays.toString(toSort));
	}
}
