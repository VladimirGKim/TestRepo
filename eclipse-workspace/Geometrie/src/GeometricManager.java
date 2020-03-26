
public class GeometricManager {
	
	Geometric [] shapes;
	
	public GeometricManager (Geometric [] shapes) {
		this.shapes = shapes;
	}
	
	//Beginn des zu bearbeitenden Bereiches
	
	// Aufgabe 3
	public double totalArea () {
		double sum = 0;
		for(int i=0; i<shapes.length; i++) {
			sum+=shapes[i].area();
		}
		return sum;
		
	}
	
	// Aufgabe 4
	public int countCircles () {
		int counter = 0;
		for(int i=0; i<shapes.length; i++) {
			if(shapes[i] instanceof Circle) {
				counter++;
			}
		}
		return counter;
		
	}
	
	// Aufgabe 5
	public void increase () {
		for(int i=0; i<shapes.length; i++) {
			if(shapes[i] instanceof Circle) {
				Circle newCircle = (Circle)(shapes[i]);
				newCircle.setRadius(newCircle.getRadius()+1);
			} else {
				Rectangle newRectangle = (Rectangle)(shapes[i]);
				newRectangle.setHeight(newRectangle.getHeight()+1);
				newRectangle.setWidth(newRectangle.getWidth()+1);
			}
		}
	}

}
