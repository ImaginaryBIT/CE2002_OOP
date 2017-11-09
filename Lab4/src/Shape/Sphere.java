package Shape;

public class Sphere extends Circle{

	public Sphere(int radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}
	
	public double area() {
		return 4*super.area();
	}
}
