package Shape;

public class Cone implements Shape{
	
	private Circle circle;
	private int height;
	private int base;
	
	public Cone(int height, int base) 
	{
		this.height = height;
		this.base = base;
	}

	@Override
	public double area() {
		circle = new Circle((int)0.5*this.base);
		return circle.area() + Math.PI*0.5*base*height;
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
