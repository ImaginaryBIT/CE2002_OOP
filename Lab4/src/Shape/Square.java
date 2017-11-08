package Shape;

public class Square implements Shape{
	
	private int edge;
	
	public Square(int edge)
	{
		this.edge = edge;
	}

	@Override
	public double area() {
		return Math.pow(edge, 2);
	}
	//Cube
	public double area3D() {
		return 4*Math.pow(edge, 2);
	}
	//Cylinder
	public double area3D2() {
		return Math.PI * Math.pow(edge*0.5, 2) * edge;
	}

}

