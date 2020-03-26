
public abstract class Medium 
{
	MedienListe title;
	
	public Medium(MedienListe title)
	{
		this.title=title;
	}
	
	public MedienListe getTitle()
	{
		return title;
	}
	
	public abstract Medium neuerArtikel();
	
	public abstract String [] getWichtigePersonen();

	
}
