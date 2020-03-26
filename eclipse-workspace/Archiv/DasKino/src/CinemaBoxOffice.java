
public class CinemaBoxOffice
{
	//Das Kino, das diese Kasse verwalten soll.
	private Cinema cinema;
	
	//Im Kostruktor wird das Kino uebergeben.
	//Danach kann die Kinokasse durch die Variable
	//kino mit diesem Kino arbeiten.
	public CinemaBoxOffice(Cinema cinema)
	{
		this.cinema = cinema;
	}
	
	//===================================
	// BEGINN des zu bearbeitenden Codes
	//===================================
	
	// Aufgabe 1
	public String reserve(int row, int seat)
	{
		return null;
	}
	
	// Aufgabe 2
	public boolean available(int row, int seat)
	{
		return false;
	}
	
	// Aufgabe 3
	public int availableSeats()
	{
		return 0;
	}
	
	// Aufgabe 4
	public int reservedSeats()
	{
		return 0;
	}
	
	// Aufgabe 5
	public double proportionAvailableSeats()
	{
		return 0;
	}
	
	//=================================
	// ENDE des zu bearbeitenden Codes
	//=================================
	
	public static void main(String[] args)
	{
		Cinema k = new Cinema(2,3);
		CinemaBoxOffice kasse = new CinemaBoxOffice(k);
		System.out.println("So sieht das Kino aus:");
		k.print();
		System.out.println("Ein freier Platz wird reserviert. Es sollte Platz reserviert ausgegeben werden:");
		System.out.println(kasse.reserve(1, 1));
		System.out.println("So sieht das Kino jetzt aus:");
		k.print();
		System.out.println("Es wird versucht, einen Platz zu reservieren, der nicht vorhanden ist. Es sollte Platz nicht vorhanden ausgegeben werden:");
		System.out.println(kasse.reserve(0, 10));
		System.out.println("Ein freier Platz wird reserviert. Es sollte Platz reserviert ausgegeben werden:");
		System.out.println(kasse.reserve(0, 0));
		System.out.println("Ein freier Platz wird reserviert. Es sollte Platz reserviert ausgegeben werden:");
		System.out.println(kasse.reserve(0, 1));
		System.out.println("Ein bereits belegter Platz soll reserviert werden. Es sollte Platz belegt ausgegeben werden:");
		System.out.println(kasse.reserve(1, 1));
		System.out.println("So sieht das Kino jetzt aus:");
		k.print();
		System.out.println("Ist Platz (1, 1) frei? Es sollte false ausgegeben werden:");
		System.out.println(kasse.available(1, 1));
		System.out.println("Ist Platz (1, 10) frei? Es sollte false ausgegeben werden:");
		System.out.println(kasse.available(10, 10));
		System.out.println("Ist Platz (0, 2) frei? Es sollte true ausgegeben werden:");
		System.out.println(kasse.available(0, 2));
		System.out.println("Es sind so viele Plaetze im Kino frei (3 waere richtig):");
		System.out.println(kasse.availableSeats());
		System.out.println("So viele Plaetze sind belegt (3 waere richtig):");
		System.out.println(kasse.reservedSeats());
		System.out.println("Der Anteil an freien Plaetzen betraegt (0.5 waere richtig):");
		System.out.println(kasse.proportionAvailableSeats());

	}
}