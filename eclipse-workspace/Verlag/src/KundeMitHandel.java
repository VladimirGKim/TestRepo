
public class KundeMitHandel extends Kunde
{

	public KundeMitHandel(String Vorname, String Name)
	{
		super(Vorname, Name);
	}

	@Override
	public KundenRolle getRolle() {
		// TODO Auto-generated method stub

		return KundenRolle.Haendler;
	}

}
