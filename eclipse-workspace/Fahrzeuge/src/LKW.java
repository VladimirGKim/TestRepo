//--------------------- Aufgabe 6 ---------------------
public class LKW extends Car implements Loadable
{

	@Override
	public String getLoadTyp() {
		// TODO Auto-generated method stub
		return "Blablabla";
	}

	@Override
	public int getCapacity() {
		// TODO Auto-generated method stub
		int randomCapacity = Math.abs((int)(Math.random())+1);
		return randomCapacity;
	}

	@Override
	public int getLoad() {
		// TODO Auto-generated method stub
		int randomLoad = Math.abs((int)(Math.random()*getCapacity()) + 1);
		return randomLoad;
	}
	
}