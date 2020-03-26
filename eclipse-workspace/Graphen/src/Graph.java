import java.util.LinkedList;

public class Graph {

	private LinkedList<Crossroad> crossroads;
	private int globalId;

	public Graph() {
		crossroads = new LinkedList<Crossroad>();
		globalId = 1;
	}

	// Beginn des zu Bearbeitenden Bereichs:

	//Aufgabe 1
	public void addCrossroad() {
		
		crossroads.add(new Crossroad(this.globalId));
		this.globalId += 1; 
	}

	//Aufgabe 2
	public Crossroad findCrossroad(int id) {

		for(Crossroad cr: crossroads) {
			if(cr.getId() == id) {
				return cr;
			}
		}
		
		return null;
		
	}

	//Aufgabe 3
	public void addOneWayStreet(int startCrossroadId, int targetCrossroadId, int distance) {
		
		for(Crossroad tcr: crossroads) {
			if(tcr.getId() == targetCrossroadId) {
				OneWayStreet ows = new OneWayStreet(tcr,distance);
				for(Crossroad scr: crossroads) {
					if(scr.getId() == startCrossroadId) {
						scr.getOneWayStreets().add(ows);
					}
				}
			}
		}

	}

	//Aufgabe 4
	public int findOneWayStreet(int startCrossroadId, int targetCrossroadId) {
		
		for(Crossroad scr: crossroads) {
			if(scr.getId() == startCrossroadId) {
				for(OneWayStreet ows: scr.getOneWayStreets()) {
					if(ows.getTarget().getId() == targetCrossroadId) {
						return ows.getDistance();
					}
				}
			}
		}
		return -1;
		
	}

	//Aufgabe 5
	public void removeOneWayStreet(int startCrossroadId, int targetCrossroadId) {
		
		for(Crossroad scr: crossroads) {
			if(scr.getId() == startCrossroadId) {
				for(OneWayStreet ows: scr.getOneWayStreets()) {
					if(ows.getTarget().getId() == targetCrossroadId) {
						int index = scr.getOneWayStreets().indexOf(ows);
						scr.getOneWayStreets().remove(index);
					}
				}
			}
		}
	}

	//Aufgabe 6
	public void removeCrossroad(int id) {
		int indexOfCrossroad = 0;
		for(Crossroad cr: crossroads) {
			if(cr.getId() == id) {
				cr.getOneWayStreets().clear();
				indexOfCrossroad = crossroads.indexOf(cr);
			}
			for(OneWayStreet ows: cr.getOneWayStreets()) {
				if(ows.getTarget().getId() == id) {
					cr.getOneWayStreets().remove(ows);
				}
			}
			
		}
		crossroads.remove(indexOfCrossroad);
	}

	//Aufgabe 7
	public int totalDistance() {
		int sum = 0;
		for(Crossroad cr: crossroads) {
			for(OneWayStreet ows: cr.getOneWayStreets()) {
				sum += ows.getDistance(); 
			}
		}
		return sum;
		
	}

	
	// Ende des zu Bearbeitenden Bereiches

	public String toString() {
		if (crossroads.isEmpty()) {
			return "Crossroads im Graphen: []  Der Graph ist leer.";
		}
		String result = "Crossroads im Graphen: " + crossroads;
		for (Crossroad crossroad : crossroads) {
			for (OneWayStreet oneWayStreet : crossroad.getOneWayStreets()) {
				result += "\n" + crossroad + " ---> " + oneWayStreet.getTarget() + "   [distance = "
						+ oneWayStreet.getDistance() + "]";
			}
		}
		return result;
	}

}