package Shape;

public class Triangle implements Shape{
	
	private int height;
	private int base;
	
	public Triangle(int height, int base)
	{
		this.height = height;
		this.base = base;
	}

	@Override
	public double area() {
		return 0.5*height*base;
	}
	//square-based Pyramid
	public double area3D() {
		return 4*this.area();
	}
	//Cone
	public double area3D2() {
		return Math.PI*0.5*base*height;
	}

}
