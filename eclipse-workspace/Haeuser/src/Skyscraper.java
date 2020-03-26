//	-------------------- Aufgabe 1 --------------------
// A)
public class Skyscraper extends Building{

	private int apartments;

	public Skyscraper(int apartments) {
		this.apartments = apartments;
	}
// -----Die Methoden fuer A) und B) muessen erst noch eingefuegt werden.-----

	@Override
	public int rentalCosts() {
		// TODO Auto-generated method stub
		int costs = 100*getPlotArea()-300*apartments;
		if(costs < 300) {
			costs = 300;
		}
		return costs;
	}
	
	protected void setPlotArea(int plotArea) {
		if(plotArea <= 80 && plotArea >= 20) {
			super.setPlotArea(plotArea);
		} else {
			super.setPlotArea(35);
		}
	}

	
	
}
