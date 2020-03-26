
public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println(quersumme(12345));
		int array [] = {5,3,6,3,8,0,6};
		int zahl1 [] = {3,4,6,8,9,12,1};
		System.out.println("Maximale Zahl ist: " +  maxArray(array));
		System.out.println("Anzahl an Übereinstimmungen: " + zahl(array, zahl1));
	}
		
			
	public static int quersumme(int a){
		int quersumme = 0;
		for(int i = 0; a!=0;a/=10) {
			quersumme +=a%10;		
	}
		return quersumme;
	}
	
	public static int zahl(int [] tipp, int [] zahl) {
		int counter = 0;
		for(int i = 0; i<tipp.length; i++) {
			if(tipp[i] == zahl[i]) {
				counter++;
			}
		}
		return counter;
	}
	public static int maxArray(int [] array) {
		int max = array[0];
		for(int i = 0; i<array.length; i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		return max;
	}
}
