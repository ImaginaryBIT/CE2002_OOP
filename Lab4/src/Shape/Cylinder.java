package Shape;

public class Cylinder implements Shape{
	
	private Circle circle;
	private int height;
	private int breadth;
	
	public Cylinder(int height, int breadth)
	{
		this.height = height;
		this.breadth = breadth;
	}

	@Override
	public double area() {
		circle = new Circle((int)0.5*breadth);

		return 2*circle.area() + circle.perimeter()*height;
	}

	@Override
	public double area3D() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double area3D2() {
		// TODO Auto-generated method stub
		return 0;
	}

}
