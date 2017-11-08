package Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shape3DApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOfShape, choose, parameter1, parameter2, calculate;
		
		Scanner sc = new Scanner(System.in);
		
		boolean step = true;
		
		while(step) 
		{		
			double area = 0;
			System.out.println("Please enter the total number of shapes.");
			numberOfShape = sc.nextInt();
			
			Shape [] shapes = new Shape[numberOfShape];
			
			for(int i=0; i<numberOfShape; i++) {
				
				System.out.println("Please choose the shape, "
						+ "\n1 for Cube"
						+ "\n2 for Cylinder"
						+ "\n3 for Sphere"
						+ "\n4 for Cone"
						+ "\n5 to exit");
				choose = sc.nextInt();
				
				switch(choose) {
				
					case 1:
						System.out.println("Please enter the edge.");
						parameter1 = sc.nextInt();
						shapes[i] =  new Square(parameter1);
						break;
						
					case 2:
						System.out.println("Please enter the height.");
						parameter1 = sc.nextInt();
						System.out.println("Please enter the breadth.");
						parameter2 = sc.nextInt();
						shapes[i] = new Rectangle(parameter1, parameter2);
						break;
						
					case 3:
						System.out.println("Please enter the radius.");
						parameter1 = sc.nextInt();
						shapes[i] = new Circle(parameter1);
						break;
						
					case 4:
						System.out.println("Please enter the height.");
						parameter1 = sc.nextInt();
						System.out.println("Please enter the base.");
						parameter2 = sc.nextInt();		
						shapes[i] = new Triangle(parameter1,parameter2);
						break;
						
					default:
						System.out.println("Exit!");
						step = false;
						break;
				}
				
			}
			
			if(step == true) 
			{
				System.out.println("Please choose \n1 to calculate area\n2 to exit");
				calculate = sc.nextInt();
				if(calculate==1) 
				{
					for(int j=0; j<shapes.length;j++)
					area = area + shapes[j].area3D2();
					System.out.println("The total area is " + area);
				}
				else
				{
					System.out.println("exit!");
				}
			}

			
			
		}
	}
}
