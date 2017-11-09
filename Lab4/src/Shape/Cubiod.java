package Shape;

public class Cubiod extends Rectangle{
	

	public Cubiod(int height, int breadth) {
		super(height, breadth);
		// TODO Auto-generated constructor stub
	}

	public double area() {
		return 4*super.area() + 2*Math.pow(super.getBreadth(), 2);
	}
	
	

}
