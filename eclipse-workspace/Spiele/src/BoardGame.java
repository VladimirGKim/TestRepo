                          //Aufgabe 1
public class BoardGame extends Game implements GroupActivities {

	public BoardGame(String name) {
		super(name);
		setPlayer(2);
	}
	
	protected void setPlayer(int player) {
		if (player <= GroupActivities.maxNumberOfPlayers && player >= GroupActivities.minNumberOfPlayers) {
			super.setPlayer(player);
		}
	}

	
	// Zu bearbeitender Bereich :
	
    // Aufgabe 3
	public String toString() {
		return super.toString() + " (Brettspiel)";
	}
	//Aufgabe 2 

	@Override
	public double calculatePlayingTime() {
		// TODO Auto-generated method stub
		double result;
		if(getPlayer() > 10) {
			result = 1.5 * getPlayer(); 
		} else {
			result = 14 - 1.5*getPlayer();
		}
		if(result > maxPlayingTime) {
			result = maxPlayingTime;
		} else if(result < minPlayingTime) {
			result = minPlayingTime;
		}
		return result;
	}

}
