public class Buch extends Medium
{
	String Autor;
	
	public Buch(MedienListe title, String Autor) 
	{
		super(title);
		this.Autor = Autor;
	}
	
	public String getAutor()
	{
		return Autor;
	}
	
	public void setAutor(String Autor)
	{
		this.Autor=Autor;
	}

	@Override
	public Medium neuerArtikel() {
		// TODO Auto-generated method stub
		Medium neu = new Audio(getTitle(), getAutor(), "Till Lindemann");
		return neu;
	}

	@Override
	public String[] getWichtigePersonen() {
		// TODO Auto-generated method stub
		String [] neu = {getAutor()};
		return neu;
	}

}
