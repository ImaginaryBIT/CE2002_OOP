package Shape;

public class Circle implements Shape{
	
	private int radius;
	
	public Circle(int radius)
	{
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	public double perimeter() {
		return Math.PI * radius;
	}
	//Sphere
	public double area3D() {
		return 4*this.area();
	}
	//Sphere
	public double area3D2() {
		return 4*this.area();
	}

}
