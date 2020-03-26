
public class Main 
{
	
	public static void main(String [] args)
	{
		Verlag empire = new Verlag();
	
		System.out.println("============================= Test der Methode insertKunde() ========================================");
		System.out.println("Deine Ausgabe ist:");
		System.out.println();
		
		empire.insertKunde();

		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Die erwartete Ausgabe ist:");
		System.out.println();
		System.out.println("Der Kunde Secret Invader ist ein Privatkunde!");
		System.out.println("Der Kunde Georg Wilsberg ist ein Haendler!");
		System.out.println("Der Kunde Lucifer Morningstar ist ein Privatkunde!");
		System.out.println("Der Kunde Jacob Anton Mayer ist ein Haendler!");
		System.out.println();
		System.out.println();
		System.out.println("============================= Test der Methode insertMedium() ========================================");
		System.out.println("Deine Ausgabe ist:");
		System.out.println();
		
		empire.insertMedium();

		System.out.println();
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Die erwartete Ausgabe ist:");
		System.out.println();
		System.out.println("Wir besitzen das Buch Game_Of_Thrones!");
		System.out.println("Wir besitzen das Hörbuch ES!");
		System.out.println("Wir besitzen das Buch Sherlock_Holmes_Der_Hund_von_Baskerville!");
		System.out.println("Wir besitzen das Hörbuch Die_Schatzinsel!");
		System.out.println("Wir besitzen das Buch Robinson_Crusoe!");
		System.out.println("Wir besitzen das Hörbuch Harry_Potter_und_der_Stein_der_Weisen!");
		
		System.out.println();
		System.out.println();
		System.out.println("============================= Test der Methode MedienInformationen() ==================================");
		System.out.println("Deine Ausgabe ist:");
		System.out.println();
	
		empire.MedienInformationen();
		
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Die erwartete Ausgabe ist:");
		System.out.println();
		System.out.println("Unser Buch Game_Of_Thrones ist von dem Autor George R. R. Martin!");
		System.out.println("Unser Hörbuch ES ist von dem Autor Stephen King und wird gelesen von David Nathan!");
		System.out.println("Unser Buch Sherlock_Holmes_Der_Hund_von_Baskerville ist von dem Autor Arthur Conan Doyle!");
		System.out.println("Unser Hörbuch Die_Schatzinsel ist von dem Autor Robert Louis Stevenson und wird gelesen von Thomas Dehler!");
		System.out.println("Unser Buch Robinson_Crusoe ist von dem Autor Daniel Defoe!");
		System.out.println("Unser Hörbuch Harry_Potter_und_der_Stein_der_Weisen ist von dem Autor J. K. Rowling und wird gelesen von Rufus Beck!");
		
		System.out.println();
		System.out.println();
		System.out.println("============================= Test 1 der Methode ZusatzMedien(int) ==================================");
		System.out.println("Deine Ausgabe ist:");
		System.out.println();
		
		empire.ZusatzMedien(1);
		
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Die erwartete Ausgabe ist:");
		System.out.println();
		System.out.println("Unser Buch Game_Of_Thrones ist von dem Autor George R. R. Martin!");
		System.out.println("Unser Hörbuch ES ist von dem Autor Stephen King und wird gelesen von David Nathan!");
		System.out.println("Unser Buch Sherlock_Holmes_Der_Hund_von_Baskerville ist von dem Autor Arthur Conan Doyle!");
		System.out.println("Unser Hörbuch Die_Schatzinsel ist von dem Autor Robert Louis Stevenson und wird gelesen von Thomas Dehler!");
		System.out.println("Unser Buch Robinson_Crusoe ist von dem Autor Daniel Defoe!");
		System.out.println("Unser Hörbuch Harry_Potter_und_der_Stein_der_Weisen ist von dem Autor J. K. Rowling und wird gelesen von Rufus Beck!");
		System.out.println("Unser Hörbuch Game_Of_Thrones ist von dem Autor George R. R. Martin und wird gelesen von Till Lindemann!");
		
		System.out.println();
		System.out.println();
		System.out.println("============================= Test 2 der Methode ZusatzMedien(int) ==================================");
		System.out.println("Deine Ausgabe ist:");
		System.out.println();
		
		empire.ZusatzMedien(2);
		
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Die erwartete Ausgabe ist:");
		System.out.println();
		System.out.println("Unser Buch Game_Of_Thrones ist von dem Autor George R. R. Martin!");
		System.out.println("Unser Hörbuch ES ist von dem Autor Stephen King und wird gelesen von David Nathan!");
		System.out.println("Unser Buch Sherlock_Holmes_Der_Hund_von_Baskerville ist von dem Autor Arthur Conan Doyle!");
		System.out.println("Unser Hörbuch Die_Schatzinsel ist von dem Autor Robert Louis Stevenson und wird gelesen von Thomas Dehler!");
		System.out.println("Unser Buch Robinson_Crusoe ist von dem Autor Daniel Defoe!");
		System.out.println("Unser Hörbuch Harry_Potter_und_der_Stein_der_Weisen ist von dem Autor J. K. Rowling und wird gelesen von Rufus Beck!");
		System.out.println("Unser Hörbuch Game_Of_Thrones ist von dem Autor George R. R. Martin und wird gelesen von Till Lindemann!");
		System.out.println("Unser Buch ES ist von dem Autor Stephen King!");	
		
		System.out.println();
		System.out.println();
		System.out.println("============================= Test 3 der Methode ZusatzMedien(int) ==================================");
		System.out.println("Deine Ausgabe ist:");
		System.out.println();
		
		empire.ZusatzMedien(0);
		
		System.out.println("Das gesuchte Medium existiert nicht!");
		
		System.out.println();
		System.out.println();
		System.out.println("============================= Test 4 der Methode ZusatzMedien(int) ==================================");
		System.out.println("Deine Ausgabe ist:");
		System.out.println();
		
		empire.ZusatzMedien(8);
		
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Die erwartete Ausgabe ist:");
		System.out.println();
		System.out.println("Unser Buch Game_Of_Thrones ist von dem Autor George R. R. Martin!");
		System.out.println("Unser Hörbuch ES ist von dem Autor Stephen King und wird gelesen von David Nathan!");
		System.out.println("Unser Buch Sherlock_Holmes_Der_Hund_von_Baskerville ist von dem Autor Arthur Conan Doyle!");
		System.out.println("Unser Hörbuch Die_Schatzinsel ist von dem Autor Robert Louis Stevenson und wird gelesen von Thomas Dehler!");
		System.out.println("Unser Buch Robinson_Crusoe ist von dem Autor Daniel Defoe!");
		System.out.println("Unser Hörbuch Harry_Potter_und_der_Stein_der_Weisen ist von dem Autor J. K. Rowling und wird gelesen von Rufus Beck!");
		System.out.println("Unser Hörbuch Game_Of_Thrones ist von dem Autor George R. R. Martin und wird gelesen von Till Lindemann!");
		System.out.println("Unser Buch ES ist von dem Autor Stephen King!");	
		System.out.println("Unser Hörbuch ES ist von dem Autor Stephen King und wird gelesen von Till Lindemann!");

	}

}
