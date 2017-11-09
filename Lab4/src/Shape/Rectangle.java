package Shape;

public class Rectangle implements Shape{
	
	private int height;
	private int breadth;
	
	public Rectangle(int height, int breadth)
	{
		this.height = height;
		this.breadth = breadth;
	}
	
	public int getBreadth() {
		return this.breadth;
	}

	@Override
	public double area() {
		return height*breadth;
	}
	//Cubiod
	public double area3D() {
		return 4*this.area();
	}
	//Cylinder
	public double area3D2() {
		return Math.PI * Math.pow(breadth*0.5, 2) * height;
	}

}
