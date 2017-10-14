package lab1;

import java.util.Scanner;

public class P3 {

	public static final double RATE = 1.82;

	public static void main(String[] args) {

		int i, starting, ending, increment;

		Scanner sc = new Scanner(System.in);

		System.out.print("starting:");
		;
		starting = sc.nextInt();

		System.out.print("ending:");
		ending = sc.nextInt();

		System.out.print("increment:");
		increment = sc.nextInt();
		
		if (starting <= ending) {
		
			System.out.println("US$         S$");
			System.out.println("--------------");
			
			/*for(i=starting; i<=ending; i=i+increment) { 
			 
			 System.out.format("%d %14.2f %n", i, i*RATE); 
			 }*/
			 

			/*i = starting;
			
			while (i <= ending) {
			
				System.out.format("%d %14.2f %n", i, i * RATE);
				
				i = i + increment;
			}*/

			i = starting;
			
			do {
				
				System.out.format("%d %14.2f %n", i, i * RATE);
				
				i = i + increment;
				
			} while (i <= ending);
			
		}
		
		else System.out.print("Error input");
	}

}

