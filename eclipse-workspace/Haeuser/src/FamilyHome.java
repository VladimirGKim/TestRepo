//	-------------------- Aufgabe 2 --------------------
// A)
public class FamilyHome  extends Building{

	private int inhabitants;

	public FamilyHome(int inhabitants) {
		this.inhabitants = inhabitants;
	}
// -----Die Methoden fuer A) und B) muessen erst noch eingefuegt werden.------

	@Override
	public int rentalCosts() {
		// TODO Auto-generated method stub
		int costs = 50*getPlotArea()-100*inhabitants;
		if(costs < 600) {
			costs = 600;
		}
		return costs;
	}
	
	protected void setPlotArea(int plotArea) {
		if(plotArea <= 60 && plotArea >= 30) {
			super.setPlotArea(plotArea);
		} else {
			super.setPlotArea(35);
		}
	}
}


