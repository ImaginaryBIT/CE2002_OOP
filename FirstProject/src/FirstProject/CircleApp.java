
package FirstProject;

import java.util.Scanner;

public class CircleApp {
	
	public static void main(String[] args) {
		
		int option;
		
		double rad;
		
		Circle circle = null;
		
		System.out.println("==== Circle Computation =====");
		
		System.out.println("|1. Create a new circle |");
		
		System.out.println("|2. Print Area |");
		
		System.out.println("|3. Print circumference |");
		
		System.out.println("|4. Quit |");
		
		System.out.println("=============================");
		
		do{
			
			System.out.println("Choose option(1-3)");
			
			Scanner sc = new Scanner(System.in);
			
			option = sc.nextInt();
			
			switch (option) {
			
			case 1: 
				
				System.out.println("Enter the radius to compute the area and circumference");
				
				Scanner sc1 = new Scanner(System.in);
				
				rad = sc1.nextInt();
				
				circle = new Circle(rad);
				
				circle.setRadius(rad);
				
				System.out.println("A new circle is created.");
				
				break;
			
			case 2:
				
				System.out.println("Area of circle");
				
				System.out.println("Radius: "+ circle.getRadius());
				
				circle.printArea();
				
				break;
				
			case 3:
				
				System.out.println("Circumference of circle");
				
				System.out.println("Radius: "+ circle.getRadius());
				
				circle.printCircumference();
				
				break;
				
			case 4:
				
				System.out.println("Thank you!");
				
				break;
			}	
				
		}while(option!=4);
		
	}


}
