public class ZahlenUmwandeln
{
	// Aufgabe 1
	public static int binaryToDecimal(String number)
	{
	    double j=0;
	    for(int i=0;i<number.length();i++){
	        if(number.charAt(i)== '1'){
	         j=j+ Math.pow(2,number.length()-1-i);
	     }

	    }
	    return (int) j;
//		int decimalValue = Integer.parseInt(number, 2);
//		return decimalValue;
	}
	
	//Aufgabe 2
	public static String decimalToBinary(int number)
	{
//		String result = Integer.toBinaryString(number);
		String ergebnis = "";
		if(number <=0) {
			ergebnis = "0";
		} else
		for(; number>0;) {
			ergebnis = (number%2) + ergebnis;
			number = number/2;
		}
		
		return ergebnis;
	}
	
	public static void main(String[] args) {
		System.out.println(binaryToDecimal("101010"));
		System.out.println(decimalToBinary(42));
	}
}
