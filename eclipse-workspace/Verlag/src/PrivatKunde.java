
public class PrivatKunde extends Kunde
{
	public PrivatKunde (String Vorname, String Name)
	{
		super(Vorname, Name);
	}

	@Override
	public KundenRolle getRolle() {
		// TODO Auto-generated method stub
		return KundenRolle.Privatkunde;
	}

}
