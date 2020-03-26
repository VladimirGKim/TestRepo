
public abstract class Kunde 
{
	String Vorname;
	String Name;
	
	public Kunde(String Vorname, String Name)
	{
		this.Vorname=Vorname;
		this.Name=Name;
	}
	
	public String getVorname()
	{
		return Vorname;
	}
	
	public void setVorname(String Vorname)
	{
		this.Vorname=Vorname;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public void setName(String Name)
	{
		this.Name=Name;
	}

	public abstract KundenRolle getRolle();
}
