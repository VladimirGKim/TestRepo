
public class Audio extends Medium
{
	String Autor;
	String Sprecher;

	public Audio(MedienListe title, String Autor, String Sprecher) 
	{
		super(title);
		this.Autor = Autor;
		this.Sprecher = Sprecher;
	}
	public String getAutor()
	{
		return Autor;
	}
	
	public void setAutor(String Autor)
	{
		this.Autor=Autor;
	}

	public String getSprecher()
	{
		return Sprecher;
		
	}
	
	public void setSprecher(String Sprecher)
	{
		this.Sprecher=Sprecher;
	}
	@Override
	public Medium neuerArtikel() {
		// TODO Auto-generated method stub
		Medium neu = new Buch(getTitle(), getAutor());
		return neu;
	}
	@Override
	public String[] getWichtigePersonen() {
		// TODO Auto-generated method stub
		String [] neu = {getAutor(), getSprecher()};
		return neu;
	}
	
}
