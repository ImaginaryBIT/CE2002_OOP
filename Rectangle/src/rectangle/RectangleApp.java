package rectangle;

public class RectangleApp {

	public static void main(String[] args) {
		
		printNumRectangle();
		
		Rectangle rect1 = new Rectangle(5.0, 10.0);
		
		printNumRectangle();
		
		Rectangle rect2 = new Rectangle();
		
		printNumRectangle();
		
		Rectangle rect3 = new Rectangle(20.0, 30.0);
		
		printNumRectangle();
		
		print(rect1);
		
		rect1.setHeight(20.0);
		
		print(rect1);
		
		rect1.setHeight(40.0);
		
		print(rect1);
		
	}
	
	public static void print(Rectangle r) {
		
		System.out.println("Width = " + r.getWidth() + "; Height = " + r.getHeight()); 
		
		System.out.println("The Area of rectangle is " + r.findArea());
		
		System.out.println("The perimeter of rectangle is " + r.findPerimeter());
		
	}
	
	public static void printNumRectangle() {
		
		System.out.println("The number of rectangles is " + Rectangle.getNumRectangle());
		
	}

}
