package lab1;

import java.util.Scanner;


public class P1 {

	public static void main(String[] args) {
		
		char choice;
		
		do {
		
		System.out.println("Please key in a character(a c d): (e for exit)");
		
		Scanner sc = new Scanner(System.in);
		
		choice = sc.next().trim().charAt(0);
		

		switch(choice) {
			
		case 'a': System.out.println("Action movie fan");
					break;
			
		case 'A': System.out.println("Action movie fan");
					break;
		
		case 'c':System.out.println("Comdy movie fan");
					break;
		
		case 'C':System.out.println("Comdy movie fan");
					break;
		
		case 'd':System.out.println("Drama movie fan");
					break;
		
		case 'D':System.out.println("Drama movie fan");
					break;
			
		default:System.out.println("Invalid choice");
					break;
				
		}
		}while(choice != 'e');
		
	}

}
