
// 2)
public class Circle implements Geometric{
	
	private double radius;
	
	public Circle (double r) {
		radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	//2)

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*getRadius()*getRadius();
	}

}
