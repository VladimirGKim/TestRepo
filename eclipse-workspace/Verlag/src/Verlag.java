
public class Verlag 
{
	public void insertKunde()
	{
		Kunde [] kunden = new Kunde[] 
				{
				new PrivatKunde("Secret", "Invader"),
				new KundeMitHandel("Georg", "Wilsberg"),
				new PrivatKunde("Lucifer", "Morningstar"),
				new KundeMitHandel("Jacob Anton","Mayer")
				};
		
		for (int i=0;i<kunden.length;i++)
		{
			System.out.println("Der Kunde " + kunden[i].getVorname() + " " + kunden[i].getName() + " ist ein " +kunden[i].getRolle()+ "!");
		}
	}
	
	Medium [] neues = new Medium [0];
	
	public void insertMedium()
	{
		Medium [] medien = new Medium[]
				{
						new Buch(MedienListe.Game_Of_Thrones,"George R. R. Martin"),
						new Audio(MedienListe.ES,"Stephen King", "David Nathan"),
						new Buch(MedienListe.Sherlock_Holmes_Der_Hund_von_Baskerville,"Arthur Conan Doyle"),
						new Audio(MedienListe.Die_Schatzinsel,"Robert Louis Stevenson", "Thomas Dehler"),
						new Buch(MedienListe.Robinson_Crusoe,"Daniel Defoe"),
						new Audio(MedienListe.Harry_Potter_und_der_Stein_der_Weisen, "J. K. Rowling", "Rufus Beck")
				};
		neues = medien;
		for (int i=0;i<medien.length;i++)
		{
			if(medien[i] instanceof Buch)
			{
				System.out.println("Wir besitzen das Buch " + medien[i].getTitle()+"!");
			}
			else if(medien[i] instanceof Audio)
			{
				System.out.println("Wir besitzen das Hörbuch " + medien[i].getTitle() +"!");
			}
		}
	}
	
	public void MedienInformationen()
	{
		
		for (int i=0;i<neues.length;i++)
		{
			if(neues[i] instanceof Buch)
			{
				String [] personen = neues[i].getWichtigePersonen();	
				if(personen==null)
				{
					return;
				}
				System.out.println("Unser Buch " + neues[i].getTitle() + " ist von dem Autor " + personen[0] +"!");
			}
			else if(neues[i] instanceof Audio)
			{
				String [] personen = neues[i].getWichtigePersonen();
				if(personen==null)
				{
				
					return;
				}
				System.out.println("Unser Hörbuch " + neues[i].getTitle() + " ist von dem Autor " + personen[0] + " und wird gelesen von " + personen[1] + "!");
				
			}
			
		}
	}
	
	public void ZusatzMedien(int k)
	{
		if(k<=neues.length&&k>0)
		{
			Medium[] neu=new Medium[1];
			neu[0]=neues[k-1].neuerArtikel();
			if(neu[0]!=null)
			{
				neues= arrayMerge(neues,neu);
			}
			MedienInformationen();
		}
		else
		{
			System.out.println("Das gesuchte Medium existiert nicht!");
		}
		
 			
	}
	
	public Medium[] arrayMerge(Medium[] array, Medium[] array1)
	{
		Medium[] array2 = new Medium[array.length + array1.length];
		System.arraycopy(array, 0, array2, 0, array.length);
		System.arraycopy(array1, 0, array2, array.length, array1.length);
		return array2;
	}
	
	

}
