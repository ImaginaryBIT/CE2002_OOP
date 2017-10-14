package rectangle;

public class Rectangle {
	
	public static final double MAX_WIDTH = 100;
	
	public static final double MAX_HEIGHT = 100;
	
	//instant variable
	private double width;
	
	private double height;
	
	//class variable
	private static int numRectangle = 0;

	//constructor
	public Rectangle() {
		
		//also can use -> this (1.0, 1.0);
		//but numRectangle will add one more time.
		
		width =1.0;
		
		height = 1.0;
		
		numRectangle++;
	}
	
	public Rectangle(double width, double height) {
		
		this.width = width;
		
		this.height = height;
		
		numRectangle++;
	}
	
	//mutators method
	public void setWidth(double w) {
		
		if (w >= MAX_WIDTH)
			
			width = MAX_WIDTH;
		
		else
			width = w;
	}
	
	public void setHeight(double h) {
		
		if(h >= MAX_HEIGHT)
			
			height = MAX_HEIGHT;
		
		else
			height = h;
	}
	
	//accessors method
	public double getWidth() {
		
		return width;
	}
	
	public double getHeight() {
		
		return height;
	}
	
	//instance method
	public double findArea() {
		
		return this.width * this.height;
	}
	
	public double findPerimeter() {
		
		return 2 * (this.width + this.height);
	}
	
	//class method
	public static void setNumRectangle(int num) {
		
		numRectangle = num;
	}
	
	public static int getNumRectangle() {
		
		return numRectangle;
	}

}
